package com.hackerrank.example;

import java.util.Scanner;

public class TieRopesGreedyAlgorithmGrab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of K");
        int k = scanner.nextInt();
        System.out.println("Enter the value of array size");
        int n = scanner.nextInt();
        int [] A = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++){
            A[i] = scanner.nextInt();
        }
        System.out.println(tiedRope(A, k));
    }

    static int tiedRope(int [] A, int k){
    int total = 0;
    int currentLenght = 0;

    for (int i = 0; i< A.length; i++){
        currentLenght = currentLenght + A[i];
        if (currentLenght >= k){
            total++;
            currentLenght = 0;
        }
    }
    return total;

    }

}
