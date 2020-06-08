package com.hackerrank.example;

import java.util.Scanner;
import java.util.Stack;

public class EqualStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int h1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            h1[i] = scanner.nextInt();
        }

        int h2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            h2[i] = scanner.nextInt();
        }

        int h3[] = new int[n3];
        for (int i = 0; i < n3; i++) {
            h3[i] = scanner.nextInt();
        }

        int result = equalStack(h1, h2, h3);
        System.out.println(result);
        scanner.close();
    }

    private static int equalStack(int[] h1, int[] h2, int[] h3) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();

        int st1TotalHeight = 0;
        int st2TotalHeight = 0;
        int st3TotalHeight = 0;

        for (int i = h1.length - 1; i >= 0; i--) {
            st1TotalHeight += h1[i];
            st1.push(st1TotalHeight);
        }

        for (int i = h2.length - 1; i >= 0; i--) {
            st2TotalHeight += h2[i];
            st2.push(st2TotalHeight);
        }

        for (int i = h3.length - 1; i >= 0; i--) {
            st3TotalHeight += h3[i];
            st3.push(st3TotalHeight);
        }

        while (true) {
            if (st1.isEmpty() || st2.isEmpty() || st3.isEmpty()) {
                return 0;
            }

            st1TotalHeight = st1.peek();
            st2TotalHeight = st2.peek();
            st3TotalHeight = st3.peek();

            if (st1TotalHeight == st2TotalHeight && st2TotalHeight== st3TotalHeight){
                return st1TotalHeight;
            }

            if (st1TotalHeight>= st2TotalHeight && st1TotalHeight >= st3TotalHeight){
                st1.pop();
            }else if (st2TotalHeight >= st3TotalHeight && st2TotalHeight >= st1TotalHeight){
                st2.pop();
            }else if (st3TotalHeight >= st1TotalHeight && st3TotalHeight >= st2TotalHeight){
                st3.pop();
            }

        }


    }
}
