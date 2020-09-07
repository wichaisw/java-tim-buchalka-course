package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readThenSumTenNumbers();


    }

    private static void readThenSumTenNumbers() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while(count <= 10) {
            System.out.println("Enter number #" + count + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }

        System.out.println("Total is " + sum);
        scanner.close();
    }

    private static void readNameAndYearOfBirth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            // next แล้ว convertเป็น  integer ใหเ้เลย
            int yearOfBirth = scanner.nextInt();

            // ถ้าไม่ nextLine การกด enter จะทำให้เข้าใจว่ารับค่า name มาแล้ว
            // อ่าน line seperator เป็น input
            scanner.nextLine(); // handle next line character (enter key)l

            System.out.println("Enter your name: ");
            // nextLine อ่านทั้งบรรทัด
            // next อ่านจนเเจอเว้นวรรค (delimiter)
            // แล้วตัวหลังเว้นวรรคจะนับเป็น input ที่ 2 ต่อไปเลย ไม่ได้หายไปไหน
            String name = scanner.nextLine();

            int age = 2020 - yearOfBirth;
            if((age >= 0) && (age <= 1000)) {
                System.out.println("Your name is " + name + ". You are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }
}
