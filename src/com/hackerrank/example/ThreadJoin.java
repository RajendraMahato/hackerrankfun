package com.hackerrank.example;

public class ThreadJoin extends Thread {

    public  void run(){

        for (int i = 1; i<= 5; i++){

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("KHUSHI KUMARI = " +i);

        }

    }

    public static void main(String args[]){

        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();
        t1.start();

        try {

            t1.join(1500);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        t2.start();
        t3.start();

    }

}
