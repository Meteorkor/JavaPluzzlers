package com.meteor.javapluzzlers.q71_q80;

import org.junit.jupiter.api.Test;

public class Q73 {

    @Test
    void wrong() {
        String s = Api.newString();

    }

    class Api {
//        private static class String(){}//주석 해제하면 오류발생
        //이름 재사용은 위험하다, 하이딩, 섀도잉, 피하라.
        public static String newString() {
            return new String();
        }
    }
}
