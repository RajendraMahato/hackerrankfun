package com.hackerrank.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CompareTheTriplates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a0 = sc.nextInt();
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b0 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add(a0);
        list.add(a1);
        list.add(a2);
        list1.add(b0);
        list1.add(b1);
        list1.add(b2);
        List<Integer> result = compareTriplate(list, list1);
        System.out.println(Arrays.asList(result));
        sc.close();
    }

    static List<Integer> compareTriplate(List<Integer> list, List<Integer> list1) {
        int aliceTotalScore = 0;
        int bobTotalScore = 0;
        for (int i = 0; i < 3; i++) {
            int alicScore = list.get(i);
            int bobScore = list1.get(i);
            if (alicScore != bobScore) {
                int temp = alicScore > bobScore ? aliceTotalScore++ : bobTotalScore++;
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(aliceTotalScore);
        result.add(bobTotalScore);
        return result;
    }
}
