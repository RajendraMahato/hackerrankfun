package com.hackerrank.example;

import java.util.Scanner;

public class Clouds {

    static int v1(int[]c){
      int len = c.length;
      int count = -1;
      for (int i = 0; i <len;){
          if (i+2 < len && c[i+2] == 0){
              i = i+2;
          }else{
              i++;
          }
          count++;
      }
        return count;
    }

    static int v2(int[]c){
        int len = c.length;
        int count = -1;
        for (int i = 0; i <len;){
            if (i+2 < len && c[i+2] == 0){
                i++;
            }
            i++;
            count++;
        }
        return count;
    }

    static int v3Final(int[]c){
        int len = c.length;
        int count = -1;
        for (int i = 0; i <len; i++, count++){
            if (i+2 < len && c[i+2] == 0){
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n = scanner.nextInt();
        int[]c = new int[n];
        for (int i = 0; i<n; i++){
            c[i] = scanner.nextInt();
        }
       int jumpCount = v3Final(c);
        System.out.println("jump count "+jumpCount);
        scanner.close();
    }
}
