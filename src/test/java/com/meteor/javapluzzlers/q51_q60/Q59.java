package com.meteor.javapluzzlers.q51_q60;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class Q59 {

    @Test
    void wrong() {
        int vals[] = { 789, 678, 567, 456, 345, 234, 123, 012 };
        //012, 는 8진수로 해석됨
        Set<Integer> diffs = new HashSet<>();

        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals.length; j++) {
                diffs.add(vals[i] - vals[j]);
            }
        }

        System.out.println(diffs.size());//27
    }

    @Test
    void answer() {
        int vals[] = { 789, 678, 567, 456, 345, 234, 123, 12 };
        //012, 는 8진수로 해석됨
        Set<Integer> diffs = new HashSet<>();

        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals.length; j++) {
                diffs.add(vals[i] - vals[j]);
            }
        }

        System.out.println(diffs.size());//15
        //교훈, 정수 리터럴 앞에 0을 넣지 말라.
    }

}
