package com.yakov.advanced08;

public class MultiThreadSample {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int j = 0; j <= 10; j++) {
            System.out.println("Hello from main thread " + j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <=10; i++){
            System.out.println("Hello from MyThread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}