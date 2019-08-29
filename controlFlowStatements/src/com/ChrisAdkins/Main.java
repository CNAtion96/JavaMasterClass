package com.ChrisAdkins;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//        int value = 12;
//        if(value ==1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }
//
//        int switchValue = 1;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }
//
//
//        char switchChar = 'G';
//
//        switch (switchChar) {
//            case 'A': case 'a':
//                System.out.println("Char is A or a");
//                break;
//
//            case 'B': case 'b':
//                System.out.println("Char is B or b");
//                break;
//
//            case 'C': case 'c':
//                System.out.println("Char is C or c");
//                break;
//
//            case 'D': case 'd':
//                System.out.println("Char is D or d");
//                break;
//
//            case 'E': case 'e':
//                System.out.println("Char is E or e");
//                break;
//
//            default:
//                System.out.println("Char was not A, B, C, D, or E");
//                break;
//        }
        System.out.println(isLeapYear(2000));
        System.out.println(2000 % 400);
        System.out.println(2000 % 4);
        System.out.println(2000 % 100);
    }
    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Day");
        }

        if(day == 0) {
            System.out.println("Sunday");
        } else if(day == 1) {
            System.out.println("Monday");
        } else if(day == 2) {
            System.out.println("Tuesday");
        } else if(day == 3) {
            System.out.println("Wednesday");
        } else if(day == 4) {
            System.out.println("Thursday");
        } else if(day == 5) {
            System.out.println("Friday");
        } else if(day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Day");
        }
    }

    public static void printNumberInWord(int number) {
        switch(number) {
            case 0:
                System.out.println("ZERO");
                break;

            case 1:
                System.out.println("ONE");
                break;

            case 2:
                System.out.println("TWO");
                break;

            case 3:
                System.out.println("THREE");
                break;

            case 4:
                System.out.println("FOUR");
                break;

            case 5:
                System.out.println("FIVE");
                break;

            case 6:
                System.out.println("SIX");
                break;

            case 7:
                System.out.println("SEVEN");
                break;

            case 8:
                System.out.println("EIGHT");
                break;

            case 9:
                System.out.println("NINE");
                break;

            default:
                System.out.println("other");
                break;
        }
    }

    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        }
        if(year % 4 == 0) {
            if(year % 400 == 0) {
                return false;
            } else if(year % 100 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        if(isLeapYear(year)){
            return 29;
        } else {
            return 28;
        }
    }
}
