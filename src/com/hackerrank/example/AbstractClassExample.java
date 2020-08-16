package com.hackerrank.example;

public abstract class AbstractClassExample {

    public void phoneVerification(){
        this.onPhoneVerificationNetworkCallStarted();
        String number = "9123429488";
        this.onPhoneVerificationSuccess(number);
        this.onPhoneVerificationFailed();
    }

    public abstract void onPhoneVerificationSuccess(String number);
    public abstract void onPhoneVerificationFailed();
    public abstract void onPhoneVerificationFailedUsedNumber();
    public abstract void onPhoneVerificationNetworkCallStarted();

}
