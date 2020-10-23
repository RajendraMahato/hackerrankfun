package com.hackerrank.example;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size");
        int arr_size = scanner.nextInt();
        int[] arr = new int[arr_size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter search element");
        int search_element = scanner.nextInt();
        int result = binarySearch(arr, 0, arr.length - 1, search_element);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element index is = "+result);
        scanner.close();
    }

    private static int binarySearch(int[] arr, int l, int r, int x ){
        // l is initial postion 0, and r is length of the array, x is search element

       if (r >= l){
           int mid = l + (r - l)/2 ;
           if (arr[mid] == x)
               return mid;
           if (arr[mid] > x)
               return binarySearch(arr, l , mid -1, x);
           return binarySearch(arr, mid + 1, r, x);
       }
       return -1;
    }

}
