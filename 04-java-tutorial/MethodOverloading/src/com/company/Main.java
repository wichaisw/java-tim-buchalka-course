package com.company;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Noom", 500);
        System.out.println("new score is " + newScore);
        int unnamedScore = calculateScore(800);
        System.out.println("new unnamed player got " + unnamedScore + " points");
        calculateScore();

        calcFeetAndInchesToCentimeters(6, 13);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("UnnamedPlayer scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("No player name, no player score");
//        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet >= 0 && inches >= 0 && inches <= 12) {
            double totalInches = inches + (feet * 12);
            System.out.println(feet + " feet " + inches + " inches = " + totalInches * 2.54d + "cm");
            return totalInches * 2.54d;
        }

        System.out.println("invalid parameter");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0) {
            int feet = (int) (inches / 12);
            double remainingInches = (inches % 12);
            System.out.println(inches + " inches = " + calcFeetAndInchesToCentimeters(feet, remainingInches) + "cm" );
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }

        System.out.println("invalid parameter");
        return -1;
    }
}
