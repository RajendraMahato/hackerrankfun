package com.hackerrank.example;

import java.util.Scanner;

public class EqualizeTheArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxCount = equalizeArray(arr);
        System.out.println(maxCount);
        sc.close();

    }

    private static int equalizeArray(int[] arr) {
        int len = arr.length;
        int[] aux = new int[101];
        for (int i = 0; i < len; i++) {
            int index = arr[i];
            aux[index]++;
        }

        int maxCount = getMaxCount(aux);
        return len - maxCount;
    }

    private static int getMaxCount(int[] aux) {
        int maxCount = Integer.MIN_VALUE;
        for (int feqCount: aux){
            if (feqCount > maxCount){
                maxCount = feqCount;
            }
        }
        return maxCount;
    }

}
