package com.hackerrank.example;

import java.util.Scanner;

public class FindDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            int result = findDigit(input);
            System.out.println(result);
        }
        scanner.close();
    }

    private static int findDigit(int n) {
        int count = 0;
        int num = n;
        while (n > 0) {
            int r = n % 10;
            if (r != 0 && num % r == 0) {
                count++;
                n = n / 10;
            }
        }
        return count;
    }

}
