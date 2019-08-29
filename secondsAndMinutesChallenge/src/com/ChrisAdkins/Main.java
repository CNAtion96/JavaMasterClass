package com.ChrisAdkins;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(78, 45));
        System.out.println(getDurationString(544));
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hours = minutes / 60;
            int remainingMinutes = 0;
            if(hours > 0) {
                remainingMinutes = minutes % 60;
            } else {
                remainingMinutes = minutes;
            }
            if (hours > 10) {
                if (minutes < 10) {
                    if (seconds < 10) {
                        String duration = "0" + hours + "h 0" + remainingMinutes + "m 0" + seconds + "s";
                        return duration;
                    }
                }
            } else if (minutes < 10) {
                if (seconds < 10) {
                    String duration = hours + "h 0" + remainingMinutes + "m 0" + seconds + "s";
                    return duration;
                }
            } else if (seconds < 10) {
                String duration = hours + "h " + remainingMinutes + "m 0" + seconds + "s";
                return duration;
            } else {
                String duration = hours + "h " + remainingMinutes + "m " + seconds + "s";
                return duration;
            }
        }
        return "Invalid Value";
    }

    public static String getDurationString(int seconds) {
        if(seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        } else {
            return "Invalid Value";
        }
    }
}
