package com.eneserturk.thread3;

public class Main {
    public static void main(String[] args) {

        Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Çalışıyor...");
                for (int i = 0; i <= 10; i++) {
                    try {
                        System.out.println("Yazıyor : " +i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        /*
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Çalışıyor...");
                for (int i = 0; i <= 10; i++) {
                    try {
                        System.out.println("Yazıyor : " +i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

         */

        printer1.start();
        System.out.println("Main thread çalışıyor...");

    }
}
