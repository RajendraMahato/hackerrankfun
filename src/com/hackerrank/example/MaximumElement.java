package com.hackerrank.example;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        maxStack.push(Integer.MIN_VALUE);
        for (int i = 0; i < N; i++) {
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    int item = scanner.nextInt();
                    mainStack.push(item);
                    int maxSoFar = maxStack.peek();
                    if (item > maxSoFar) {
                        maxStack.push(item);
                    } else {
                        mainStack.push(maxSoFar);
                    }
                    break;
                case 2:
                    mainStack.pop();
                    maxStack.pop();
                    break;
                case 3:
                    System.out.println(maxStack.peek());
                    break;
            }

        }
        scanner.close();
    }
}
