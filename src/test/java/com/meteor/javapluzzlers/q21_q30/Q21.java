package com.meteor.javapluzzlers.q21_q30;

import java.io.File;
import java.util.regex.Matcher;

import org.junit.jupiter.api.Test;

public class Q21 {

    @Test
    void wrong() {
        //플랫폼마다 파일 구분자가 다르다.
        final String className = Q21.class.getName().replaceAll("\\.", File.separator) + ".class";
        System.out.println("className : " + className);
        //mac에서는 문제없이 동작하지만, window의 경우 구분자를 백슬래시로 사용하기 때문에 에러발생
    }

    @Test
    void answer() {
        final String className = Q21.class.getName().replaceAll("\\.", Matcher.quoteReplacement(File.separator))
                                 + ".class";
        System.out.println("className : " + className);
        //replaceAll 두번째 인자는 치환스트링이라 \가 오면 백슬래시 하나라 정상동작하지 않는다고 함
    }

}
