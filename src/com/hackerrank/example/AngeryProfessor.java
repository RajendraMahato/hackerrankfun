package com.hackerrank.example;

import java.util.Scanner;

public class AngeryProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scanner.nextInt();
            }
            String result = angreyProfessor(k, arr);
            System.out.println(result);
        }
        scanner.close();
    }

    private static String angreyProfessor(int k, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                count++;
            }
        }
        return ((count >= k) ? "NO" : "YES");
    }
}
