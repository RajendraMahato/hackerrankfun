package com.hackerrank.example;

import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPageCount = scanner.nextInt();
        int targetPage = scanner.nextInt();
        int result = pageCount(totalPageCount, targetPage);
        System.out.println(result);
        scanner.close();
    }

    private static int pageCount(int n, int p) {
        int totalPageCount = n / 2;
        int targetPageFromFront = p / 2;
        int targetPageFromBack = totalPageCount - targetPageFromFront;
        int pageCount = Math.min(targetPageFromFront, targetPageFromBack);
        return pageCount;
    }
}
