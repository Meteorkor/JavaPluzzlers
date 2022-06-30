package com.meteor.javapluzzlers.q31_q40;

import org.junit.jupiter.api.Test;

public class Q37 {

    @Test
    void wrong1() {
//컴파일 에러

//        try {
//            System.out.println("Hello world");
//        } catch (IOException e) {
//            System.out.println("발생할 일 없음");
//
//        }

    }

    @Test
    void wrong2() {
        try {
            //do noting
        } catch (Exception e) {
            System.out.println("에러는 발생하지않지만 컴파일에는 문제없음");
        }
    }

    @Test
    void wrong3() {
        Type3 t3 = new Arcane3();
        t3.f();
        //체크 필요없이 호출이 된다.
        //throws를 다중상속하면 각 throws가 합집합이 되는것이 아니라 교집합으로 동작한다.
    }

    interface Type1 {
        void f() throws CloneNotSupportedException;
    }

    interface Type2 {
        void f() throws InterruptedException;
    }

    interface Type3 extends Type1, Type2 {
    }

    public static class Arcane3 implements Type3 {

        @Override
        public void f() {
            System.out.println("Hello World!!");
        }
    }

}
