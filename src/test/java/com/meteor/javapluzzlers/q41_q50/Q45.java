package com.meteor.javapluzzlers.q41_q50;

import org.junit.jupiter.api.Test;

public class Q45 {

    @Test
    void wrong() {
        workHard();
        //재귀로 인하여 무한루프를 돌것을 생각할 수 있지만, 실제로는 프로그램이 결국 종료되긴한다.
        //try 안에서 stack overflow가 발생하고, workHard에서 overflow가 발생하게 된다.
        System.out.println("낮잠 잘 시간.");

    }

    private void workHard() {
        try {
            workHard();
        } finally {
            workHard();
        }
    }

}
