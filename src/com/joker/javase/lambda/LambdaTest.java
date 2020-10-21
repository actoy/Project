package com.joker.javase.lambda;

/**
 *  * 实例LambdaTest
 *  *
 *  * @version 1.0
 *  
 */
public class LambdaTest {

    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("running1 ... ");
            }
        };
        runnable1.run();

        Runnable runnable2 = () -> {
            System.out.println("running2 ... ");
        };
        runnable2.run();

        Runnable runnable3 = () -> System.out.println("running3 ... ");
        runnable3.run();

    }
}
