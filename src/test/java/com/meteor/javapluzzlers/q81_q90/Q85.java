package com.meteor.javapluzzlers.q81_q90;

import org.junit.jupiter.api.Test;

public class Q85 {
    private static boolean initialized = false;

    static {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                //해당 스레드에서 Q85가 초기화대기를 기다리고 있다.
                //초기화 과정은 가능한 단순해야한다
                initialized = true;
            }
        });
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    void wrong() {
        System.out.println(initialized);//hang
    }

}
