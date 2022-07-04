package com.meteor.javapluzzlers.q51_q60;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class Q60 {

    @Test
    void coding1() {
        final Set<String> linkedHashSet = new LinkedHashSet(
                List.of("spam", "sausage", "spam", "spam", "bacon", "spam", "tomato", "spam"));

        System.out.println(linkedHashSet);
    }

    @Test
    void coding2() {
        String text =
                "fear, surprise, ruthless efficiency, an almost fanatical devotion to the Pope, nice red uniforms";

        Arrays.stream(text.split(","))
              .map(s -> s.trim()).forEach(s -> {
                  System.out.println(s);
              });
    }

    @Test
    void coding2Answer() {
        String text =
                "fear, surprise, ruthless efficiency, an almost fanatical devotion to the Pope, nice red uniforms";

        Arrays.stream(text.split(",\\s*"))
              .forEach(s -> {
                  System.out.println(s);
              });
        //교훈, 새로운 기능과 향상 페이지를 학습하여 각 릴리즈가 제공하는 편의성능 놓치지 않도록 해야한다.
        //라이브러리에 무엇이 있는지 알고 있다면, 많은 시간과 노력을 줄일 수 있을 뿐만 아니라, 프로그램의 속도와 질 또한 향상시킬 수 있다.
    }

}
