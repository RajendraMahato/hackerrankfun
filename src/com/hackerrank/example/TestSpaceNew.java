package com.hackerrank.example;

import java.util.Scanner;

public class TestSpaceNew extends AbstractClassExample{

    public static void main(String args[]){
        SingletonExample singletonExample = new SingletonExample();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("result = "+sum);
        if (singletonExample != null)
        singletonExample.printSingleton();

        AbstractClassExample abstractClassExample = new TestSpaceNew();
        abstractClassExample.phoneVerification();
    }

    @Override
    public void onPhoneVerificationSuccess(String number) {
        System.out.println("phone number...."+number);
    }

    @Override
    public void onPhoneVerificationFailed() {

    }

    @Override
    public void onPhoneVerificationFailedUsedNumber() {

    }

    @Override
    public void onPhoneVerificationNetworkCallStarted() {

    }
}
