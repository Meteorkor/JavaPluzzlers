package com.meteor.javapluzzlers.q81_q90;

import org.junit.jupiter.api.Test;

public class Q83 {

    @Test
    void wrong() {

    }

    static class WrongDog extends Exception {
        //싱글톤? -> Exception내에 Serializable 있어서 여러개 존재할수 있다.
        public static final WrongDog INSTANCE = new WrongDog();

        private WrongDog() {}

        public String toString() {
            return "Woof";
        }

        //해당 메소드를 추가함으로 싱글톤을 유지할 수 있다.
        private Object readResolve(){
            return INSTANCE;
        }
    }
}
