package com.hackerrank.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ofoperation do you want");
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("enter the amount");
            int m = scanner.nextInt();
            System.out.println("enter the size of the array");
            int n = scanner.nextInt();
            System.out.println("enter " + n + " array element");
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            int result[] = iceCreamParlor(m, a);
            System.out.println(result[0] +" "+result[1]);
            scanner.close();
        }
    }

    private static int[] iceCreamParlor(int m, int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];
        for (int i = 0; i < a.length; i++) {
            int x = a[i];
            int y = m - x;
            Integer j = map.get(y);//getting the index of value y from map
            if (j != null) {
                result[0] = j + 1; //in the question they have mentioned that use 1 based index,but we were using 0 based that is why doing +1
                result[1] = i + 1;
                break;
            }
            map.put(x, i);
        }
        return result;
    }
}
