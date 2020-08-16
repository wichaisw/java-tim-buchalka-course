package com.company;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String ในจาวา immutable สร้างแล้วเปลี่ยนไม่ได้ แต่ string ตัวใหม่ถูกสร้างขึ้นมาแทน
        String myString = "my first string";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println("my appended string = " + myString);
        myString += "\u00A9 2019";
        System.out.println("my string is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

    }
}
