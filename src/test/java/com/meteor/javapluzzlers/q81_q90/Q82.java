package com.meteor.javapluzzlers.q81_q90;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class Q82 {
    static final String COMMAND = "java BeerBlast slave";

    @Test
    void wrong() throws IOException, InterruptedException {
        String[] args = {};

        if (args.length == 1 && args[0].equals("slave")) {
            for (int i = 99; i > 0; i--) {
                System.out.println(i + " bottles of beer on the wall");
            }
        } else {
            //마스터
            Process process = Runtime.getRuntime().exec(COMMAND);
            int exitValue = process.waitFor();
            System.out.println("exit value = " + exitValue);
        }
        //자식 프로세스의 종료를 보장하려면 자식 프로세스의 아웃풋 스트림을 없애주어야 한다
        //이는 오류 스트림에도 동일하게 적용된다.
        //1.5 에서는 ProcessBuilder 라는 클래스가 이러한 스트림을 없애는 작업을 도와주기 위해 추가되었다.
        
    }
}
