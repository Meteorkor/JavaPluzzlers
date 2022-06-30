package com.meteor.javapluzzlers.q31_q40;

import org.junit.jupiter.api.Test;

public class Q40 {

    @Test
    void wrong() {
        try {
            Reluctant reluctant = new Reluctant();
            System.out.println("Surprise!");
            ///java.lang.StackOverflowError
            //인스턴스 변수 초기화가 생성자보다 먼저 실행된다
            //인스턴스 초기화가 던지는 모든 예외는 생성자에 전달된다.
            //무한 재귀 반복이 벌어지지 않도록 주의
        } catch (Exception e) {
            System.out.println("I told you so");
        }

    }

    public class Reluctant {
        private Reluctant internalInstance = new Reluctant();

        public Reluctant() throws Exception {
            throw new Exception("I'm not coming out");
        }
    }
    
}
