package com.meteor.javapluzzlers.q51_q60;

import org.junit.jupiter.api.Test;

public class Q53 {

    @Test
    void wrong() {

    }

    class Thing {
        public Thing(int i) {

        }
    }

    class MyThing extends Thing {
        private final int arg;

        public MyThing() {
            this(Q53.func());
        }

        private MyThing(int i) {
            super(i);
            arg = i;
        }
    }

    private static int func() {
        return 0;
    }

}
