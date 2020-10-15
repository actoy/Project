package com.joker.juc;

import java.util.concurrent.TimeUnit;

/**
 *  * 实例WhatIsThread
 *  *
 *  * @version 1.0
 *  
 */
public class WhatIsThread {
    private static class T1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i< 10; i++) {
                try {
                    TimeUnit.MICROSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T1");
            }
        }
    }

    public static void main(String[] args) {
        //方法调用
        //new T1().run();
        new T1().start();
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.MICROSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main");
        }
    }
}
