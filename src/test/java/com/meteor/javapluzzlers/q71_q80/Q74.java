package com.meteor.javapluzzlers.q71_q80;

import org.junit.jupiter.api.Test;

public class Q74 {

    @Test
    void wrong() {
        Enigma e = new Enigma();
        System.out.println(e.equals(e));

    }

    //equals 오버라이딩 하지 않고, e.equals(e) false로

    private class Enigma {
        public boolean equals(Enigma e) {//;;;
            //이렇게 하지 말라
            return false;
        }
    }

    private class Enigma2 {
        public Enigma2() {
            System.out.println(false);
            System.exit(0);
        }
    }
}
