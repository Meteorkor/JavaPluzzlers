package com.meteor.javapluzzlers.q41_q50;

import org.junit.jupiter.api.Test;

public class Q48 {

    @Test
    void wrong() {
        Dog woofer = new Dog();
        Dog nipper = new Basenji();
        woofer.bark();//Dog.bark()
        nipper.bark();//Dog.bark()

        //여기서 overide되지 않았지만 마치 된것처럼 혼동된다.
        //static 메소드는 클래스이름을 사용해야 혼동이 없다.
    }

    class Dog {
        public static void bark() {
            System.out.println("woof");
        }
    }

    class Basenji extends Dog {
        public static void bark() {}
    }

}
