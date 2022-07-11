package com.meteor.javapluzzlers.q81_q90;

import org.junit.jupiter.api.Test;

public class Q90 {

    @Test
    void wrong() {
        Outer o = new Outer();
        //컴파일이 안된다고 했는데.. 잘 된다....

        //내부 클래스를 작성할 때면, 스스로에게 이 클래스가 외부 인스턴스를 정말로 필요로 하는가? 를 물어보라
        //아니라면, 내부 클래스를 static으로 선언하라

    }

    public class Outer {
        class Inner1 extends Outer {

        }

        class Inner2 extends Inner1 {

        }
    }

}
