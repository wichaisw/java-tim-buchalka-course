package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 2_147_483_643;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println(myValue);

        // เลขเกิน max, min ของ data type จะ overflow กลับเป็นค่าติดลบ / หรือ underflow ค่าบวก
        // ถ้าใส่ค่าเกินมาตั้งแต่ประกาศตัวแปร จะ error ก่่อนเลย
        System.out.println("Busted max value " + (myMaxIntValue + 1));
        System.out.println("Busted min value " + (myMinIntValue - 5));

        String myString = "duck";
        // check type object or string ถ้าเป็น primitive ให้ดูจาก error เอา หรือเป็น wrapper class ก้ดูได้
        // wrapper class ไว้สร้าง 8 primitive data types เป็น object
        System.out.println(myString.getClass());

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min " + myMinByteValue);
        System.out.println("Byte max " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min " + myMinShortValue);
        System.out.println("Short max " + myMaxShortValue);
        
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min " + myMinLongValue);
        System.out.println("Long max " + myMaxLongValue);

        // ใส่ L หลัง long value ให้้คอมรู้ว่าเป็น long
        // ไม่งั้น ใส่ long ก็มองเป็น int, overflow ได้
        long myLongValue = 3_147_483_643L;
        System.out.println(myLongValue);

        int myTotal = (myMinIntValue / 2);

        // Type Casting
        // ค่าพอดี byte แต่ถ้าไม่กำหนดไทป์จาวาให้ default เป็น int จึงใส่ casting ให้จาวาณู้ว่าจะทรีตยังไง
        // ดู Widening Casting ถ้าตัวแปรไทปค่ามากกว่า auto ไม่ต้องวงเล็บ / Narrowing casting
        byte myNewByteValue = (byte)(myMinByteValue /2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short)(myMinShortValue / 2);

        byte myByte = (byte) 120;
        short myShort = (short) 30000;
        int myInt = 400_000_000;
        long longTotal = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println(longTotal);
    }
}
