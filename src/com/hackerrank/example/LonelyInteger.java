package com.hackerrank.example;

import java.util.Scanner;

public class LonelyInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = lonelyInteger(arr);
        System.out.println(result);
        scanner.close();
    }

    private static int lonelyInteger(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        return result;
    }
}
