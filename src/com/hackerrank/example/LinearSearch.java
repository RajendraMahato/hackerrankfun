package com.hackerrank.example;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arr_size = scanner.nextInt();
        System.out.println("Enter array element");
        int[] arr = new int[arr_size];
        for (int i = 0; i<arr_size; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Please enter the search element");
        int search_element = scanner.nextInt();

        int result = Search(arr, search_element);
        if (result == -1){
            System.out.println("Search element not available");
        }else{
            System.out.println("Search element is in index = "+result);
        }
        scanner.close();

    }

    private static int Search(int[] arr, int x){
        int arr_length = arr.length;
        for (int i = 0; i < arr_length; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

}
