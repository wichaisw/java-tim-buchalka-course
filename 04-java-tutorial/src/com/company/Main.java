package com.company;

public class Main {

    public static void main(String[] args) {
        double first = 20.00d;
        double second = 80.00d;
        double result = (first + second) * 100.00d;
        System.out.println(result);
        result = result % 40.00d;

        boolean isNoRemainder = (result == 0) ? true : false;
        System.out.println("test isZero = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

        boolean gameOver = true;

        String variableInBlock = "at first";
        System.out.println("first = " + variableInBlock);
        if(gameOver) {
            variableInBlock = "in-block var";
            System.out.println("game over = " + gameOver);
            System.out.println("inside = " + variableInBlock);
        }

        System.out.println("outside = " + variableInBlock);
    }
}
