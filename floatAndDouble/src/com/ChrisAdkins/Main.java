package com.ChrisAdkins;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5 / 2;
	    float myFloatValue = 5f / 3f;
	    double myDoubleValue = 5d /3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double myPounds = 200d;
        double myKilos = myPounds * 0.45359237d;
        System.out.println("Kilograms = " + myKilos);
    }
}
