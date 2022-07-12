package com.meteor.javapluzzlers.q91_q95.q81_q90;

import org.junit.jupiter.api.Test;

public class Q92 {
    @Test
    void wrong() {
        new Twisted("main").reproduce();//main
        //private 멤버는 절대 상속되지 않는다는 규칙때문
        //프로그램을 살펴보는 것만으로 프로그램이 무엇을 하는지 알아낼 수 없다면, 프로그램은 아마도 여러분이 원하는 일을 하지 않을 것이다.
    }

    class Twisted {
        private final String name;

        Twisted(String name) {
            this.name = name;
        }

        private String name() {
            return name;
        }

        private void reproduce() {
            new Twisted("reproduce") {
                void printName() {
                    System.out.println(name());
                }
            }.printName();
        }
    }
}
