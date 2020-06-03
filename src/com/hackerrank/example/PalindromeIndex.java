package com.hackerrank.example;

import java.util.Scanner;

public class PalindromeIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many string do you want?");
        int n = scanner.nextInt();
        System.out.println("Please enter your string to check palindrome");
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            int result = palindromeIndex(s);
            //System.out.println("Removal of index "+String.valueOf(result)+ " will make it palindrome");
            if (result == -1){
                System.out.println("already a palindrome string or not a valide palidreome "+result);
            }else {
                System.out.println(result);
            }
        }
        scanner.close();
    }

    static int palindromeIndex(String s) {
        int palindromeIndex = -1;
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                if (i + 1 < len) {
                    boolean isStringValidPalindrome = isValidPalindrome(s.substring(i + 1, len - i));
                    if (isStringValidPalindrome)
                        return i;
                    return len - i - 1;
                }

            }

        }
        return palindromeIndex;
    }

    private static boolean isValidPalindrome(String substring) {
        int len = substring.length();
        for (int i = 0; i < len / 2; i++) {
            if (substring.charAt(i) != substring.charAt(len - i - 1)) {
                return false;
            }

        }
        return true;
    }

}
