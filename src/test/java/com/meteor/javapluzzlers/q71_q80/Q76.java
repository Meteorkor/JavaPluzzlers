package com.meteor.javapluzzlers.q71_q80;

import org.junit.jupiter.api.Test;

public class Q76 {

    @Test
    void wrong() {
        run();
    }

    @Test
    void answer() throws InterruptedException {
        run2();
        //언제나 순서는 같다
    }

    static synchronized void run() {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        //이건 별도 스레드로 동작하는것이 아니라, 그냥 call이다.

        System.out.println("Ping");
    }

    static synchronized void run2() throws InterruptedException {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.start();

        System.out.println("Ping");
//        Thread.sleep(1000 * 10);
    }

    static synchronized void pong() {
        System.out.println("Pong");
    }

}
