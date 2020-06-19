package com.hackerrank.example;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("min sum max sum " + minMaxSum(arr));
        scanner.close();
    }


//    /*
//    approch 1, which is not efficient
//     */
//    static String minMaxSum(int[] arr){
//        long minSum = 0;
//        long maxSum = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            minSum += arr[i];
//        }
//        for (int i = 1; i < arr.length; i++) {
//            maxSum += arr[i];
//        }
//        return minSum + " "+maxSum;
//    }

    /*
    approch two
     */

    static String minMaxSum(int[] arr) {
        //[1, 3, 5, 4, 6]
        long min = 0, max = 0, sum = 0;
        min = arr[0];
        max = min;
        sum = min;

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return (sum - max) + "  " + (sum - min);
    }
}
