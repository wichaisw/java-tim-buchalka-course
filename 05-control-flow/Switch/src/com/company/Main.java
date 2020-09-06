package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 4;
//        switch(value) {
//            case 1:
//                System.out.println("value was 1");
//                break;
//            case 2:
//                System.out.println("value was 2");
//                break;
//            case 3:case 4: case 5:
//                System.out.println("Value was 3, or 4, or 5");
//                System.out.println("Actually it was a " + value);
//                break;
//            default:
//                System.out.println("value was not 1, 2, 3, 4 ,5");
//        }

        char character = 'A';
        switch (Character.toLowerCase(character)) {
            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println("found you!");
                System.out.println("you are " + character);
                break;
            default:
                System.out.println("not found, so sad.");
        }

        printDayOfTheWeek(7);


    }

    private static void printDayOfTheWeek(int day) {
        switch(day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
