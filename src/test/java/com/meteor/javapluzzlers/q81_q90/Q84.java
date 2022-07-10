package com.meteor.javapluzzlers.q81_q90;

import org.junit.jupiter.api.Test;

public class Q84 {

    @Test
    void wrong() {
        Thread.currentThread().interrupt();

        if (Thread.interrupted()) {
            //Thread.interrupted() 내에서 flag를 바꾼다.
            //현재 쓰레드의 인터럽트 상태를 지우길 바라지 않는다면 Thread.interrupted() 를 사용하지 말라
            //Interrupted: false
            System.out.println("Interrupted: " + Thread.interrupted());
        } else {
            System.out.println("Not interrupted: " + Thread.interrupted());
        }

    }

    @Test
    void answer() {
        Thread.currentThread().interrupt();
        if (Thread.currentThread().isInterrupted()) {
            System.out.println("Interrupted: " + Thread.interrupted());
        } else {
            System.out.println("Not interrupted: " + Thread.interrupted());
        }
    }

}
