package com.meteor.javapluzzlers.q51_q60;

import org.junit.jupiter.api.Test;

public class Q52 {

    @Test
    void wrong() {
        System.out.println(Cache.getSum());//9900

    }

    class Cache {
        static {
            initializeIfNecessary();//여기서 initialized를 true로 만들었지만
        }

        private static int sum;

        public static int getSum() {
            initializeIfNecessary();
            return sum;
        }

        private static boolean initialized = false;//여기서 다시 false로 만든다.

        private static synchronized void initializeIfNecessary() {
            if (!initialized) {
                for (int i = 0; i < 100; i++) {
                    sum += i;
                }
                initialized = true;
            }
        }
    }

}
