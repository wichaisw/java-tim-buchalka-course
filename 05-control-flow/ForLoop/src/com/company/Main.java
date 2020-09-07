package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int count = 0;
        for(int i=10; i<=100; i ++) {
            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                count += 1;
            }
            if(count == 3) {
                System.out.println("3 prime numbers has already been found");
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

//        for(int i=2; i <= n/2; i++) {
//            if(n % i == 0) {
//                return false;
//            }
//        }
        for(int i=2; i <= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
