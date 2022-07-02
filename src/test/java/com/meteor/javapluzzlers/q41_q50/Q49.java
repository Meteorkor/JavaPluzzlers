package com.meteor.javapluzzlers.q41_q50;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

public class Q49 {

    @Test
    void wrong() {
        System.out.println("Elvis wears a size " + WrongElvis.INSTANCE.beltSize() + "belt.");//-1930
        //먼저 static 필드들은 필드의 기보ㅓㄴ값으로 설정된다.
        //그후 필드 초기화가 선언 순서대로 실행된다.
        //INSTANCE에서 Elvis() 생성자를 호출한다, 이때 CURRENT_YEAR은 아직 0이다.


    }

    @Test
    void answer() {
        //static 필드 초기자들을 재배치하여 의존하고 있는 초기자들보다 앞으로 오게하자
        System.out.println("Elvis wears a size " + AnswerElvis.INSTANCE.beltSize() + "belt.");//-1930


    }

    static class WrongElvis {
        public static final WrongElvis INSTANCE = new WrongElvis();
        private final int beltSize;
        private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);

        private WrongElvis() {
            beltSize = CURRENT_YEAR - 1930;
        }

        public int beltSize() {
            return beltSize;
        }
    }

    static class AnswerElvis {
        //static 필드 초기자들을 재배치하여 의존하고 있는 초기자들보다 앞으로 오게하자
        private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
        public static final AnswerElvis INSTANCE = new AnswerElvis();
        private final int beltSize;


        private AnswerElvis() {
            beltSize = CURRENT_YEAR - 1930;
        }

        public int beltSize() {
            return beltSize;
        }
    }

}
