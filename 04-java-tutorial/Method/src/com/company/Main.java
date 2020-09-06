package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 100;


		System.out.println("Your final score was " + calculateScore(gameOver, score, levelCompleted, bonus));

	    score = 10000;
	    levelCompleted = 8;
	    bonus = 200;
		System.out.println("Your final score was " + calculateScore(true, score, levelCompleted, bonus));
		System.out.println("Your final score was " + calculateScore(false, score, levelCompleted, bonus));

		int myPosition = calculateHighScorePosition(1000);
		System.out.println("my position = " + myPosition);
		System.out.println(displayHighScorePosition("Wichai", myPosition));
		myPosition = calculateHighScorePosition(900);
		System.out.println(displayHighScorePosition("Bob", myPosition));
		myPosition = calculateHighScorePosition(400);
		System.out.println(displayHighScorePosition("Marrie", myPosition));
		myPosition = calculateHighScorePosition(50);
		System.out.println(displayHighScorePosition("Alex", myPosition));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			return  finalScore;
		}

		return -1;
	}

	public static String displayHighScorePosition(String name, int position) {
    	return name + " manage to get into position " + position + " on the high score table";

	}

	public static int calculateHighScorePosition(int score) {
//    	if(score >= 1000) {
//			return 1;
//		} else if(score >= 500) {
//			return 2;
//		} else if(score >= 100) {
//    		return 3;
//		} else {
//    		return 4;
//		}
		int position = 4;
		if(score >= 1000) {
			position = 1;
		} else if(score >= 500) {
			position = 2;
		} else if(score >= 100) {
			position = 3;
		}

		return position;
	}

}
