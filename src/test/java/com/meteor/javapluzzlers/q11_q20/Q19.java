package com.meteor.javapluzzlers.q11_q20;

import org.junit.jupiter.api.Test;

public class Q19 {
    @Test
    void wrong() {
        System.out.println(worngClassify('n') + worngClassify('+') + worngClassify('2'));
    }

    static String worngClassify(char ch) {
        if ("0123456789".indexOf(ch) >= 0) {
            return "NUMBERAL ";
        }
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(ch) >= 0) {
            return "LETTER ";
        }

        /*
        if("+-*\/&|!=".indexOf(ch >=0)//주석시에 *\/를 주의

        */

        if(false){
            //if 주석..;;
        }

        return "UNKNOWN ";
    }

    @Test
    void answer() {
        //if("+-*/&|!=".indexOf(ch >=0)//주석시에 */를 주의
        //한줄 주석 처리를 연속으로 사용하는 방법이 가장 좋다.
        //블록 주석은 중첩으로 사용이 어렵고, 신뢰성 있게 주석처리하기 어렵다.
    }
}
