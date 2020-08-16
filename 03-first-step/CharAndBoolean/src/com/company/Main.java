package com.company;

public class Main {

    public static void main(String[] args) {

        // เก็บ 1 อักษร และต้องใช้ single quote
        // ใช้เวลาอยากเก็บค่าสุดท้าย เช่น ปุ่มสุดท้ายที่ถูกกด / เอาอักษรตัวสุดท้ายในเมนู
        // กินที่ 2 bytes = 16 bits, width = 16 เก็บเป็น 16บิตเพื่อให้เก็บ unicode character ได้ 65,535 อักษณ
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myCopyrightChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myCopyrightChar);

        // boolean
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);
    }
}
