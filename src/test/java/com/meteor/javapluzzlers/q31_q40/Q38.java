package com.meteor.javapluzzlers.q31_q40;

import org.junit.jupiter.api.Test;

public class Q38 {

    @Test
    void wrong() {
        System.out.println("UnwelcomeGuest.USER_ID : " + UnwelcomeGuest.USER_ID);

    }

    private static class IdUnavailableException extends Exception {}

    public class UnwelcomeGuest {
        public static final long GUEST_USER_ID = -1;
        //컴파일 에러를 막기위해 임의 값
        private static final long USER_ID = 1L;

        //컴파일 에러를 막기위해 주석처리
//        private static final long USER_ID;
//        static {
//            try {
//                USER_ID = getUserIdFromEnvironment();
//            } catch (IdUnavailableException e) {
//                //컴파일 에러, final
//                //final 은 프로그램에서 확실하게 할당되지 않은 시점에서만 할당 할 수 있다.
//                USER_ID = GUEST_USER_ID;
//                System.out.println("손님으로 로그인");
//
//            }
//        }

        private static long getUserIdFromEnvironment() throws IdUnavailableException {
            throw new IdUnavailableException();//오류를 시뮬레이션
        }
    }

    public class AnswerUnwelcomeGuest {
        public static final long GUEST_USER_ID = -1;
        private static final long USER_ID = getUserIdOrGuest();

        private static long getUserIdOrGuest() {
            try {
                return getUserIdFromEnvironment();
            } catch (IdUnavailableException e) {
                System.out.println("손님으로 로그인");
                return GUEST_USER_ID;
            }
        }

        private static long getUserIdFromEnvironment() throws IdUnavailableException {
            throw new IdUnavailableException();//오류를 시뮬레이션
        }
    }

}
