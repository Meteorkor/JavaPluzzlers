package com.meteor.javapluzzlers.q51_q60;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class Q58 {

    @Test
    void wrong() {
        Set<WrongName> s = new HashSet<>();
        s.add(new WrongName("Donald", "Duck"));
        System.out.println(s.contains(new WrongName("Donald", "Duck")));//false
    }

    private class WrongName {
        private final String first, last;

        public WrongName(String first, String last) {
            this.first = first;
            this.last = last;
        }

        //        public boolean equals(Object o) {
//            if (!(o instanceof WrongName)) {
//                return false;
//            }
//            WrongName n = (WrongName) o;
//            return n.first.equals(first) && n.last.equals(last);
//        }

        public boolean equals(WrongName o) {// 실수로 Overide 한경우, Object로 해야한다.
            //실수하지 않기 위하여
            //1. 이러한 작업은 IDE를 통해서 수행하라
            //2. @Overide 어노테이션을 붙여서 체크할 수 있도록 하라
            return o.first.equals(first) && o.last.equals(last);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, last);
        }
    }

}
