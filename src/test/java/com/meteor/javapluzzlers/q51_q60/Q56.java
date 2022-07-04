package com.meteor.javapluzzlers.q51_q60;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

public class Q56 {

    @Test
    void wrong() {
        BigInteger fiveThousand = new BigInteger("5000");
        BigInteger fiftyThousand = new BigInteger("50000");
        BigInteger fiveHundredThousand = new BigInteger("500000");
        BigInteger total = BigInteger.ZERO;
        total.add(fiveThousand);
        total.add(fiftyThousand);
        total.add(fiveHundredThousand);
        System.out.println(total);
        //교훈, 불변 타입을 가변 타입으로 혼동하지 않도록 주의 하라
    }

    @Test
    void answer1() {
        BigInteger fiveThousand = new BigInteger("5000");
        BigInteger fiftyThousand = new BigInteger("50000");
        BigInteger fiveHundredThousand = new BigInteger("500000");
        BigInteger total = BigInteger.ZERO;
        total = total.add(fiveThousand)
                     .add(fiftyThousand)
                     .add(fiveHundredThousand);
        System.out.println(total);
    }

    @Test
    void answer2() {
        BigInteger fiveThousand = new BigInteger("5000");
        BigInteger fiftyThousand = new BigInteger("50000");
        BigInteger fiveHundredThousand = new BigInteger("500000");
        BigInteger total = BigInteger.ZERO;
        total = total.add(fiveThousand);
        total = total.add(fiftyThousand);
        total = total.add(fiveHundredThousand);
        System.out.println(total);
    }

}
