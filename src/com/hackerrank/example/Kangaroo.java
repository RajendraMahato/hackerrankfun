package com.hackerrank.example;

import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int v2 = scanner.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
        scanner.close();
    }

    private static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 > v2) {
            int d = (x2 - x1) % (v1 - v2);
            if (d == 0) {
                return "YES";
            } else {
                return "NO";
            }
        }
        return "NO";
    }
}
