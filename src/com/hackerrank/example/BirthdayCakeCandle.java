package com.hackerrank.example;

import java.util.Scanner;

public class BirthdayCakeCandle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = getCount(arr);
        System.out.println(result);
        scanner.close();
    }

    private static int getCount(int[] arr) {
        int maxHeight = Integer.MIN_VALUE;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxHeight) {
                counter++;
            }

            if (arr[i] > maxHeight){
                maxHeight = arr[i];
                counter = 1;
            }
        }

        return counter;

    }
}
