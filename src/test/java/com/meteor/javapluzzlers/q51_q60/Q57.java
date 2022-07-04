package com.meteor.javapluzzlers.q51_q60;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class Q57 {

    @Test
    void wrong() {
        Set<WrongName> s = new HashSet<>();
        s.add(new WrongName("Mickey", "Mouse"));
        System.out.println(s.contains(new WrongName("Mickey", "Mouse")));//false
    }

    @Test
    void answer() {
        Set<AnswerName> s = new HashSet<>();
        s.add(new AnswerName("Mickey", "Mouse"));
        System.out.println(s.contains(new AnswerName("Mickey", "Mouse")));//true
        //equals를 overide할때는 hashCode도 함께 해야한다.
    }

    private class WrongName {
        private final String first, last;

        public WrongName(String first, String last) {
            this.first = first;
            this.last = last;
        }

        public boolean equals(Object o) {
            if (!(o instanceof WrongName)) {
                return false;
            }
            WrongName n = (WrongName) o;
            return n.first.equals(first) && n.last.equals(last);
        }
    }

    private class AnswerName {
        private final String first, last;

        public AnswerName(String first, String last) {
            this.first = first;
            this.last = last;
        }

        public boolean equals(Object o) {
            if (!(o instanceof AnswerName)) {
                return false;
            }
            AnswerName n = (AnswerName) o;
            return n.first.equals(first) && n.last.equals(last);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, last);
        }
    }
}
