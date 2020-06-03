package com.hackerrank.example;

import java.io.IOException;
import java.util.*;

public class CountTriplets {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        long n = scanner.nextLong();
        System.out.println("enter the array element");
        List<Long> arr = new ArrayList<>();
        while (n-- > 0) {
            arr.add(scanner.nextLong());
        }
        System.out.println("enter the ration");
        long r = scanner.nextLong();
        long result = countTriplet(arr, r);
        System.out.println("result =  " + result);
        scanner.close();
    }

    static long countTriplet(List<Long> arr, long r) {
        Map<Long, Long> rightMap = new HashMap<>();
        Map<Long, Long> leftMap = new HashMap<>();
        for (long item : arr) {
            rightMap.put(item, rightMap.getOrDefault(item, 0L) + 1);
        }
        long count = 0;
        for (int i = 0; i < arr.size(); i++) {
            long midterm = arr.get(i);
            long c1 = 0;
            long c3 = 0;
            rightMap.put(midterm, rightMap.getOrDefault(midterm, 0L) - 1);
            if (leftMap.containsKey(midterm / r) && midterm % r == 0) {
                c1 = leftMap.get(midterm / r);
            }
            if (rightMap.containsKey(midterm * r)) {
                c3 = rightMap.get(midterm * r);
            }
            count += c1 * c3;
            leftMap.put(midterm, leftMap.getOrDefault(midterm, 0L) + 1);
        }

        return count;
    }
}
