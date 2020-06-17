package com.hackerrank.example;

import java.util.Scanner;

public class SaveThePrisoner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int r = m % n;
        if ((s + r - 1) % n == 0) {
            System.out.println(n);
        } else {
            System.out.println((r + s - 1) % n);
        }
    }
}
