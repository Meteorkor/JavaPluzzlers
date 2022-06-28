package com.meteor.javapluzzlers.q21_q30;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class Q23 {
    @Test
    void wrong() {
        Random rnd = new Random();
        StringBuffer word = null;
        switch (rnd.nextInt(2)) {
            case 1:
                word = new StringBuffer('P');
            case 2:
                word = new StringBuffer('G');
            default:
                word = new StringBuffer('M');
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);//항상 ain
    }

    @Test
    void answer() {
        Random rnd = new Random();
        StringBuffer word = null;
        switch (rnd.nextInt(3)) {//2->3
            case 1:
                word = new StringBuffer("P");//'' -> "", ''면 capacity로 적용됨
                break;//break누락
            case 2:
                word = new StringBuffer("G");
                break;//break누락
            default:
                word = new StringBuffer("M");
                break;//break누락
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);//ain
    }
}
