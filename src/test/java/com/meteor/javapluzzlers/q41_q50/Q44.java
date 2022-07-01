package com.meteor.javapluzzlers.q41_q50;

import org.junit.jupiter.api.Test;

public class Q44 {

    @Test
    void wrong() {
        //실행과 동시에 Missing 클래스 파일을 지우면 어떻게 될까?
        try {//1
            Missing m = new Missing();
        } catch (NoClassDefFoundError er) {
            System.out.println("got it!!");
        }
        Missing m2;
        try {//2
            m2 = new Missing();
        } catch (NoClassDefFoundError er) {
            System.out.println("got it!!");
        }
        //프로그램을 실행하기 위해 VM 은 main 메소드를 갖고 있는 클래스를 로딩하고 초기화한다.
        //VM은 로딩과 초기화 사이에 클래스를 링킹 해야한다.
        //링킹의 첫번째 단계는 검증이며, 검증은 클래스가 잘 작성되었고 언어가 요구하는 문법을 잘 준수했는지 점검한다.
        //검증은 자바와 같은 안전한 언어가 C나 C++같은 불완전한 언어가 차별화 된다고 주장하는 중요한 기능이다.

        //1은 검증단계에서 예외를 일으키게 됨


    }

    private class Missing {}
}
