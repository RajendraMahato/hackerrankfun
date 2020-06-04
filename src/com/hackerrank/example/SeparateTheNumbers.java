package com.hackerrank.example;

import java.util.Scanner;

public class SeparateTheNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many string you want to enter");
        int n = scanner.nextInt();
        System.out.println("enter string");
        while (n-- > 0) {
            String s = scanner.next();
            separatNumber(s);
        }
        scanner.close();
    }

    static void separatNumber(String s) {
        String subString = "";
        boolean isValid = false;
        for (int i = 0; i < s.length()/2; i++){
            subString = s.substring(0, i);
            long num = Long.parseLong(subString);
            String validString = subString;//we will use this to append all string, then will chk if its valid string or not
            while(validString.length() < s.length()){
                validString += String.valueOf(num++);
            }
            if (s.equals(validString)){
                isValid = true;
                break;
            }
        }
        System.out.println(isValid ? "Yes"+ subString : "No");
    }
}
