package com.hackerrank.example;

import java.util.Scanner;

public class MaxNonOverlappingSegmentCodailityGrab {

    public static void main(String[] args) {

        System.out.println("enter the value of n");
        Scanner  scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] X = new int[N];
        System.out.println("enter the value of array X");
        for (int i = 0; i< N; i++){
            X[i] = scanner.nextInt();
        }
        System.out.println("enter the value of Array I");
        int [] I = new int[N];
        for (int i = 0 ; i< N; i++){
            I[i] = scanner.nextInt();
        }

        int n = X.length;

        System.out.println(Segment(X, I, n));

    }

    public static int Segment(int[] A, int[] B, int n){

        if (n == 1){
            return 1;
        }

        int ans = 2;

        for (int i = 1; i < n-1; i++){

            if (A[i] - B[i] > A[i-1]){
                ans++;
            }else if (A[i] + B[i] < A[i+1]){

                A[i] = A[i] + B[i];
                ans++;

            }

        }
        return ans;
    }
}
