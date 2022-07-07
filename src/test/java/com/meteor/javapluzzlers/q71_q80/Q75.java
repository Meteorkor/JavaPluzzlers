package com.meteor.javapluzzlers.q71_q80;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class Q75 {

    @Test
    void wrong() {
        System.out.println(CoinSide.flip());
    }
}

class CoinSide {
    private static Random rnd = new Random();

    public static CoinSide flip() {
        return rnd.nextBoolean() ? Heads.INSTANCE : Tails.INSTANCE;
        //1.5 이전에는 정상적으로 컴파일 되지 않는다고 한다.
        //교훈, 자바 플랫폼을 최신 버전으로 업그레이드 하라, 새로운 릴리즈는 개발자의 삶을 편하게 해 주는 많은 향상된 기능을 포함하고 있다.
    }
}

class Heads extends CoinSide {
    public static final Heads INSTANCE = new Heads();

    private Heads() {

    }

    public String toString() {
        return "heads";
    }
}

class Tails extends CoinSide {
    public static final Tails INSTANCE = new Tails();

    private Tails() {

    }

    public String toString() {
        return "tails";
    }
}