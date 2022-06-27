package com.meteor.javapluzzlers.q11_q20;

import org.junit.jupiter.api.Test;

public class Q15 {
    @Test
    void wrong() {
        //\ units ,//\ 를 붙이면 주석때문에 컴파일 에러, error: illegal unicode escape
        System.out.print("Hell");
        System.out.println("o world");
    }

    @Test
    void answer() {
        //<tt>units</tt> ,//주석때문에 컴파일 에러
        System.out.print("Hell");
        System.out.println("o world");

        //\ u 문자가 나타나지 않도록 주의해야한다.
        //자바 소스파일 주석에 윈도우 파일 이름에 백슬래시를 그대로 쓰면 안된다(\ u 가 나타날수 있음)
    }
}
