package com.meteor.javapluzzlers.q61_q70;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class Q63 {

    @Test
    void wrong() {
        WrongMoreNames moreNames = new WrongMoreNames();
        System.out.println(moreNames.size());//0
    }

    private class WrongMoreNames {
        private Map<String, String> m = new HashMap<>();

        public void WrongMoreNames() {//void.... 생성자를 잘못 쓰지 말라
            m.put("Mickey", "Mouse");
            m.put("Mickey", "Mantle");
        }

        public int size() {
            return m.size();
        }
    }

    @Test
    void answer() {
        AnswerMoreNames moreNames = new AnswerMoreNames();
        System.out.println(moreNames.size());//1
    }

    private class AnswerMoreNames {
        private Map<String, String> m = new HashMap<>();

        public AnswerMoreNames() {//void....
            m.put("Mickey", "Mouse");
            m.put("Mickey", "Mantle");
        }

        public int size() {
            return m.size();
        }
    }

}
