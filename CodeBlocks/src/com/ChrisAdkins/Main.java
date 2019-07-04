package com.ChrisAdkins;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 500;
	    int levelCompleted = 5;
	    int bonus = 100;

	    if(score < 5000) {
            System.out.println("Your score was 500");
        } else {
            System.out.println("Got here");
        }

	    if(gameOver)  { //same as (gameOver == true)
	        int finalScore = score + (levelCompleted * bonus);
	        finalScore += 1000;
            System.out.println("your final score was: " + finalScore);
        }


	    //Challenge
	    score = 10000;
	    levelCompleted = 8;
	    bonus = 200;

	    if(gameOver) {
	        int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }
    }
}
