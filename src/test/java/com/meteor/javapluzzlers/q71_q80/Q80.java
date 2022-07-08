package com.meteor.javapluzzlers.q71_q80;

import org.junit.jupiter.api.Test;

public class Q80 {

    @Test
    void wrong() throws Exception {
        new Outer().greetWorld();
    }

    private class Outer {
        public void greetWorld() throws Exception {
            System.out.println(
                    Inner.class.newInstance());//com.meteor.javapluzzlers.q71_q80.Q80$Outer$Innter.<init>()
        }

        private class Inner {//static이 빠져서 에러

            //둘러싸고 있는 인스턴스가 꼭 필요한 경우가 아니면 static이 아닌 클래스 대신 static 멤버 클래스를 사용하라
            //내부 클래스를 리플렉션을 이용하여 생성하는 작업은 가능한 피하는것이 좋다.
            public String toString() {
                return "Hello world";
            }
        }
    }
}
