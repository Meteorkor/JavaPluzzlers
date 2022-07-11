package com.meteor.javapluzzlers.q81_q90;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Q88 {

    @Test
    void wrong() {
        Pair p = new Pair(23, "skidoo");
        System.out.println(p.first + " " + p.second);
//        for (String s : p.stringList()) {// 컴파일 에러, rawType
        for (Object s : p.stringList()) {
            System.out.println(s + "");
        }

    }

    @Test
    void answer() {
//        Pair<String> p = new Pair(23, "skidoo");//T, T 라서, 23에서 cast error
        Pair<String> p = new Pair(String.valueOf(23), "skidoo");
        System.out.println(p.first + " " + p.second);
        for (String s : p.stringList()) {
            System.out.println(s + "");
        }
    }

    class Pair<T> {
        private final T first;
        private final T second;

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T first() {
            return first;
        }

        public T second() {
            return second;
        }

        public List<String> stringList() {
            return Arrays.asList(String.valueOf(first), String.valueOf(second));
        }

    }

}
