package com.meteor.javapluzzlers.q61_q70;

import org.junit.jupiter.api.Test;

public class Q70 {

    @Test
    void wrong() {
        ClickIt clickIt = new ClickIt();
        clickIt.doIt();
        //package-private 메소드는 다른 패키지에서 직접 오버라이딩 할 수 없다.

    }

    private class ClickIt {
        public void doIt() {
            printMessage();
        }

        void printMessage() {
            System.out.println("Click");
        }
    }
}
