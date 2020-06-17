package com.hackerrank.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockAndArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(scanner.nextInt());
            }
            String result = balancedSum(list);
            System.out.println(result);
        }
        scanner.close();
    }

    private static String balancedSum(List<Integer> arr) {

        int x = 0;
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }

        for (int y : arr) {
            if (2 * x == sum - y) {
                return "YES";
            }
            x = x + y;
        }
        return "NO";
    }

}
