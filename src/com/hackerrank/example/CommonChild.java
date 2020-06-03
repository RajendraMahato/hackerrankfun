package com.hackerrank.example;

import java.util.Scanner;

public class CommonChild {

    static Integer dp[][];
    static int cache[][];

    static int v1(char x[], char y[], int i, int j){
     if (i == 0 || j == 0){
         return 0;
     }

     if (x[i-1] == y[j-1]){
         return 1 + v1(x, y,i-1, j-1);
     }

        return Math.max(v1(x,y,i,j-1), v1(x,y,i-1,j));
    }

    static int v2(char x[], char y[], int i, int j, Integer[][] db){
        if (i<=0 || j<=0){
            return 0;
        }

        if (db[i][j] != null){
            return db[i][j];
        }

        if (x[i-1] == y[j-1])
            return 1 + v2(x,y,i-1, j-1,db);
        else
            return db[i][j] = Math.max(v2(x,y,i,j-1,db), v2(x,y,i-1,j,db));
    }

    public static int v3(char[] X, char[] Y, int m, int n) {
        int memo[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    memo[i][j] = 0;
                else if (X[i - 1] == Y[j - 1])
                    memo[i][j] = memo[i - 1][j - 1] + 1;
                else
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
            }
        }
        cache = memo;
        return memo[m][n];
    }

    public static int v4(char[] X, char[] Y, int m, int n) {
        int memo[] = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            int prev = 0;
            for (int j = 1; j <= n; j++) {
                int temp = memo[j];
                if (X[i - 1] == Y[j - 1]) {
                    memo[j] = prev + 1;
                } else {
                    memo[j] = Math.max(memo[j], memo[j - 1]);
                }
                prev = temp;
            }

//			display1DArray(memo, "");
        }
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your string");
        String first = scanner.next();
        System.out.println("enter second text");
        String second = scanner.next();
        int size = v4(first.toCharArray(), second.toCharArray(), first.length(), second.length());
        System.out.println("size of first "+size);
    }

}
