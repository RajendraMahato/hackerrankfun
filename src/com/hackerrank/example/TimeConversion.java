package com.hackerrank.example;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String result = timeConversion(input);
        System.out.println(result);
        scanner.close();
    }

    private static String timeConversion(String input) {
        String[] str = input.split(":");
        int hour = Integer.valueOf(str[0]);
        String min = str[1];
        String secPeriod = str[2];
        String sec = str[2].substring(0, secPeriod.length() - 2);
        String period = str[2].substring(secPeriod.length() - 2, secPeriod.length());

        String newTimeINString = "";

        if ((0 <= hour && hour < 12) && (period.equalsIgnoreCase("AM"))) {
            newTimeINString = String.format("%02d", hour) + ":" + min + ":" + sec;
        } else if ((0 <= hour && hour < 12) && (period.equalsIgnoreCase("PM"))) {
            newTimeINString = (12 + hour) + ":" + min + ":" + sec;
        } else if ((hour == 12) && (period.equalsIgnoreCase("AM"))) {
            newTimeINString = "00" + ":" + min + ":" + sec;
        } else if ((hour == 12) && (period.equalsIgnoreCase("PM"))) {
            newTimeINString = hour + ":" + min + ":" + sec;
        }

        return newTimeINString;
    }
}
