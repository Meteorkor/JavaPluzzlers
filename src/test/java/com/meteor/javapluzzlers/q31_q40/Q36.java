package com.meteor.javapluzzlers.q31_q40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q36 {

    @Test
    void wrong() {
        System.out.println(wrongDecision());
        Assertions.assertFalse(wrongDecision());//false가 반환된다..
    }

    boolean wrongDecision() {
        try {
            return true;
        } finally {
            return false;
        }
    }

    @Test
    void answer() {
        System.out.println(answerDecision());
        Assertions.assertTrue(answerDecision());
    }

    boolean answerDecision() {
        try {
            return true;
        } finally {//finally안에서는 return, break, continue, throw를 사용하지 말라
//            return false;
        }
    }

}
