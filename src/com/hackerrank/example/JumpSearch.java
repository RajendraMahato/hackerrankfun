package com.hackerrank.example;

import java.util.Scanner;

public class JumpSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the array size");
        int arr_size = scanner.nextInt();
        int[] arr = new int[arr_size];
        System.out.println("enter the array element");
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter search element");
        int search_element = scanner.nextInt();
        int result = jumpSearch(arr, search_element);
        if (result == -1){
            System.out.println("element not available"+result);
        }else{
            System.out.println("index of element is "+result);
        }
        scanner.close();
    }

    private static int jumpSearch(int[] arr, int x) {
        int arr_size = arr.length;
        int prev = 0;
        int step = (int) Math.floor(Math.sqrt(arr_size));
        while (arr[Math.min(step, arr_size) - 1] < x){
            prev = step;
            step += (int) Math.floor(Math.sqrt(arr_size));
            if (prev >= arr_size){
                return -1;
            }
            while(arr[prev] < x){
                prev++;
                if (prev == Math.min(step, arr_size))
                    return -1;
            }

            if (arr[prev] == x){
                return prev;
            }

        }
        return -1;
    }
}
