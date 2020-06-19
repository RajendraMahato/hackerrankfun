package com.hackerrank.example;

import java.util.HashSet;
import java.util.Scanner;

public class SockMerchant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = getPairCount(arr);
        System.out.println(result);
        scanner.close();
    }

    private static int getPairCount(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int counter = 0;
        for (int i =0; i<arr.length;i++){
            int element = arr[i];
            if (set.contains(element)){
                set.remove(element);
                counter++;
            }else{
                set.add(element);
            }
        }

        return counter;
    }
}
