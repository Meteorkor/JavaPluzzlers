package com.meteor.javapluzzlers.q31_q40;

import org.junit.jupiter.api.Test;

public class Q39 {

    @Test
    void wrong() {
        try {
            System.out.println("Hello world");
            System.exit(0);
            //현재 스레드와 이와 연관되어 있는 스레드를 모두 종료시킨다.
            //System.exit()가 호출되면
            // 1. Runtime.addShutdownHook으로 등록되어있는 것들을 실행하기에, VM 외부자원 해제에 좋다.
            // 2. 종료자(finalizer)와 관련있다. 종료시 각 개체에 종료자를 실행시키는데, 사장되었기 때문에 사용하지 않을것 을 추천한다.
        } finally {
            //호출되지 않는다.
            System.out.println("Goodbye world");
        }
    }

    @Test
    void answer() {
        System.out.println("Hello world");
        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> {
                    System.out.println("Goodbye world");
                })
        );
        System.exit(0);
    }

}
