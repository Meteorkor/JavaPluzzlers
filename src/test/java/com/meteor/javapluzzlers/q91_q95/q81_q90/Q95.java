package com.meteor.javapluzzlers.q91_q95.q81_q90;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

public class Q95 {
    @Test
    void wrong1() {
        int count = 0;
        for (int i = 0; i < 100; i++) ;
        {
            count++;
        }
        System.out.println(count);
        //1
        //세미콜론..
    }

    @Test
    void wrong2() {
        Integer[] array = { 3, 1, 4, 1, 5, 9 };
        Arrays.sort(array, new Comparator<Integer>() {

            @Override
            public int compare(Integer i1, Integer i2) {
                return i1 < i2 ? -1 : (i2 > i1 ? 1 : 0);
            }
        });
        System.out.println(Arrays.toString(array));
        //[1, 1, 3, 4, 5, 9]???
        //책에서는 3, 1, 4, 1, 5, 9 로 출력된다고 함...
    }

    @Test
    void wrong3() {
        System.out.println(true ? false : true == true ? false : true);
        //false
        //괄호를 쓰라..

        //교훈, 이와 같이 코딩하지 마라.
    }

}
