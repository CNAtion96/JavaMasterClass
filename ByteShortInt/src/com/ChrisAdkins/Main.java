package com.ChrisAdkins;

public class Main {

    public static void main(String[] args) {
        byte myByte = 2;
        short myShort = 537;
        int myInt = 3_539;
        long myLong = (50_000 + (10*(myByte + myShort + myInt)));

        System.out.println("myByte = " + myByte);
        System.out.println("myShort = " + myShort);
        System.out.println("myInt = " + myInt);
        System.out.println("myLong = " + myLong);
    }
}
