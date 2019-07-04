package com.ChrisAdkins;

public class Main {

    public static void main(String[] args) {
	    double kilometers = (100 * 1.609344); //double is the data type and everything after is the expression. the data type isn't part of the expression

        int highScore = 50;
        if(highScore == 50) {
            System.out.println("This is an expression");
        }


        int score = 100;
        if(score > 90) {
            System.out.println("You got the high score!");
            score = 0;
        }

        //expression in the above code on lines 14-18 are as follows:
        //score = 100;
        //score > 90
        //score = 0;
        //You got the high score

    }
}
