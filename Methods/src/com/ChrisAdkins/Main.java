package com.ChrisAdkins;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;
        String playerName = "Player 1";

        int highscore = calculateScore(gameOver, score, levelCompleted, bonus);
        int scorePosition = calculateHighScorePosition(highscore);
        String positionMessage = displayHighScorePosition(playerName, scorePosition);
        System.out.println("Your final score was "+ highscore);
        System.out.println(positionMessage);


//        //Challenge
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        calculateScore(gameOver, score, levelCompleted, bonus);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }

    public static int calculateHighScorePosition(int score){

//        if(score >= 1000) {
//            return 1;
//        } else if(score >= 500) {
//            return 2;
//        } else if(score >= 100) {
//            return 3;
//        }
//        return 4;

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

    public static String displayHighScorePosition(String playerName, int position){

        String positionMessage = playerName + " managed to get into position " + position;
        return positionMessage;

    }


}
