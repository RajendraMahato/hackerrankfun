package com.hackerrank.example;

public class SingletonExample {
    public static SingletonExample singletonInstance;

    public SingletonExample() {

    }

    public static SingletonExample getSingletonExample(){
        if (null == singletonInstance){
            singletonInstance = new SingletonExample();
        }
        return singletonInstance;
    }

    public void printSingleton(){
        System.out.println("from singleton class");
    }
}
