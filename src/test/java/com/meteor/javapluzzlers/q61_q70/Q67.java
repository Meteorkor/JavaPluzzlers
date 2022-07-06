package com.meteor.javapluzzlers.q61_q70;

public class Q67 {

    public static void main(String[] args) {//not working, noSuchMethodError main
        String s = new String("Hello world");
        System.out.println(s);
        //플랫폼 클래스의 이름을 재사용하는 것은 피해야하며, 특히 java.lang 패키지에 있는 이름은 절대 사용하자 마라.
    }

    static class String {
        private final java.lang.String s;

        public String(java.lang.String s) {
            this.s = s;
        }

        public java.lang.String toString() {
            return s;
        }
    }

}
