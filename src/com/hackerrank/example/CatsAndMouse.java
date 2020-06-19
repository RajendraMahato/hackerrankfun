package com.hackerrank.example;

import java.util.Scanner;

public class CatsAndMouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            String result = catAndMouse(x, y, z);
            System.out.println(result);
        }
        scanner.close();
    }

    private static String catAndMouse(int x, int y, int z) {
        int a = Math.abs(x - z);
        int b = Math.abs(y - z);
        if (a > b) {
            return "Cat B";
        } else if (a < b) {
            return "Cat A";
        } else {
            return "Mouse C";
        }
    }
}
