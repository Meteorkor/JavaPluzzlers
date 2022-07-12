package com.meteor.javapluzzlers.q91_q95.q81_q90;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class Q94 {

    @Test
    void wrong() {
    }

}

class WrongShuffle {
    //치우침이 있는 방식이다.
    private static Random rnd = new Random();

    public static void shuffle(Object[] a) {
        for (int i = 0; i < a.length; i++) {
            swap(a, i, rnd.nextInt(a.length));
        }
    }

    private static void swap(Object[] a, int i, int j) {
        Object tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

}

class AnswerShuffle {
    //직접 코드를 작성하기보다는 검증된 라이브러리를 사용하라
    public static void shuffle(Object[] a) {
        Collections.shuffle(Arrays.asList(a));
    }

}