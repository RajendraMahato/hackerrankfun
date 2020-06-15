package com.hackerrank.example;

import java.util.Scanner;

public class CountingValleys {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String string = scanner.next();
        System.out.println("count valleys " + countValleys(n, string));
        scanner.close();
    }

    private static int countValleys(int n, String string) {
        int valleyCounter = 0;
        int altitude = 0;
        for (int i = 0; i < n; i++) {
            char ch = string.charAt(i);
            if (ch == 'U') {
                altitude++;
                if (altitude == 0){
                    valleyCounter++;
                }
            }else{
                altitude -- ;
            }
        }
        return valleyCounter;
    }
}
