package com.hackerrank.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TripleSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of a");
        int lena = scanner.nextInt();
        System.out.println("please enter "+lena +" integer");
        int[] a = new int[lena];
        for (int i = 0; i < lena; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("enter the length of b");
        int lenb = scanner.nextInt();
        System.out.println("please enter "+lenb +" integer");
        int[] b = new int[lenb];
        for (int i = 0; i < lenb; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println("enter the length of c");
        int lenc = scanner.nextInt();
        System.out.println("please enter "+lenc +" integer");
        int[] c = new int[lenc];
        for (int i = 0; i < lenc; i++) {
            c[i] = scanner.nextInt();
        }
        long result = triplets(a, b, c);
        System.out.println("length of a " + lena + " length of b " + lenb + " length of c " + lenc);
        System.out.println("count " + result);
        scanner.close();
    }

    static long triplets(int[] a, int[] b, int[] c) {
        long longestTripletsCount = 0;

        int[] distinctA = removeDuplicates(a);
        int[] distinctB = removeDuplicates(b);
        int[] distinctC = removeDuplicates(c);

        Arrays.sort(distinctA);
        Arrays.sort(distinctB);
        Arrays.sort(distinctC);

        for (int q : distinctB) {
            long c1 = getValidIndex(distinctA, q) + 1;
            long c3 = getValidIndex(distinctC, q) + 1;
            longestTripletsCount += c1 * c3;
        }
        return longestTripletsCount;
    }

    private static long getValidIndex(int[] distinctA, int q) {
        int low = 0;
        int high = distinctA.length - 1;
        int count = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (distinctA[mid] <= q) {
                count = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return count;
    }

    private static int[] removeDuplicates(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int item : a) {
            set.add(item);
        }
        int len = set.size();
        int[] result = new int[len];
        int i = 0;
        for (int item : set) {
            result[i++] = item;
        }

        return result;
    }
}
