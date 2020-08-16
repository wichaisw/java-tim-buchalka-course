package com.company;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float max " + myMinFloatValue);
        System.out.println("Float min " + myMaxFloatValue);
        
        double myMinDoubleValue = Double.MIN_VALUE;
	    double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double max " + myMinDoubleValue);
        System.out.println("Double min " + myMaxDoubleValue);

        // double is accepted by default
        // ให้ใส่ d, f ท้ายเลขเพื่อป็นตัวบ่ง เป็น good practice
        // ปัจจุบันโดยทั่วไปใช้ double ดีกว่า
        int myIntValue = 5 / 3;
        float myFloatValue = (float) 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("int" + myIntValue);
        System.out.println("float " + myFloatValue);
        System.out.println("double " + myDoubleValue);

        // เมื่อจะคำนวณแบบแม่นๆ ใช้คลาส BigDecimal เพราะ float / double ไม่แม่นยำพอ
        // pound to kg challenge
        double poundValue = 500d;
        double kgValue = poundValue * 0.45359237d;
        System.out.println("Converted kilogram " + kgValue);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
