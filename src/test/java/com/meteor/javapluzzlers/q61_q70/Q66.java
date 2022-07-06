package com.meteor.javapluzzlers.q61_q70;

import org.junit.jupiter.api.Test;

public class Q66 {

    @Test
    void wrong() {
//        System.out.println(new Derived().className);//컴파일 에러
        //메소드에 대해서는 오버라이딩이아닌 하이딩을 한다.
        //같은 필드명이기 때문에, 하이딩 되었기 때문에 상속되지 않는다.
        //교훈 하이딩을 피하라.

    }

}

class Base {
    public String className = "Base";
}

class Derived extends Base {
    private String className = "Derived";
}
