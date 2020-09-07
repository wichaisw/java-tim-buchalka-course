package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
//        while(count != 6)  {
//            System.out.println("Count value is " + count);
//
//            count++;
//        }
//
//        count = 1;
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//
//            count++;
//        }

        // Do-While loop do the block at least 1 time
        count = 5;
        do {
            System.out.println("Count value is " + count);
            count++;

            if(count > 100) {
                break;
            }
        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumberCount = 0;
        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            evenNumberCount++;
            System.out.println("Even number " + number);

            if(evenNumberCount >= 5) {
                System.out.println("There are " + evenNumberCount + " numbers.");
                break;
            }
        }

        number = 0;
        while (number < 15) {
            number++;

            if(number <= 5) {
                System.out.println("skipping number " + number);
                continue;
            }

            System.out.println("number = " + number);

            if(number >= 10) {
                System.out.println("breaking at " + number);
                break;
            }
        }

        String numberAsString = "2018";
        System.out.println("numberAsString " + numberAsString);
        System.out.println(numberAsString + 2);
        int parsedNumber = Integer.parseInt(numberAsString);
        System.out.println(parsedNumber +2);
    }

    private static boolean isEvenNumber(int num) {
        if((num % 2) == 0) {
            return true;
        }
        return false;
    }
}
