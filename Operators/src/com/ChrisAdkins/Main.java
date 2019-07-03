package com.ChrisAdkins;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;

	    System.out.println("1 + 2 = " + result);

	    int previousResult = result;

	    result = previousResult - 1;

	    System.out.println(previousResult + " - 1 = " + result);

	    previousResult = result;

	    result = previousResult * 10;

	    System.out.println(previousResult + " * 10 = " + result);

	    previousResult = result;

	    result = previousResult / 5;

	    System.out.println(previousResult + " / 5 = " + result);

	    previousResult = result;

	    result = previousResult % 3;

	    System.out.println(previousResult + " % 3 = " + result);


	    boolean isAlien = false;

	    if (isAlien == true) {
	    	System.out.println("It is an Alien!");
		}

	    int topScore = 80;

	    if (topScore < 100) {
	    	System.out.println("You've got the high score! ");
		}

	    int secondTopScore = 81;

	    if ((topScore > secondTopScore) && (topScore > 100)) {
	    	System.out.println("Greater than top score and greater than 100!");
		}

	    if ((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("One of these tests is true.");
		}

	    int newValue = 50;

	    if (newValue == 50) {
			System.out.println("This is true.");
		}

	    boolean isCar = false;

	    if (isCar == true) {
			System.out.println("This is not supposed to happen");
		}

	    boolean wasCar = isCar ? true : false;

		System.out.println(wasCar);


		//Challenge

		double firstDouble = 20d;
		double secondDouble = 80d;

		double newDouble = (firstDouble + secondDouble) * 25d;

		double remainder = newDouble % 40d;

		if (remainder <= 20) {
			System.out.println("Total was over the limit!");
		}


    }
}
