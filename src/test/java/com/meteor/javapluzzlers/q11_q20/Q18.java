package com.meteor.javapluzzlers.q11_q20;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;

public class Q18 {
    @Test
    void wrong() {
        byte bytes[] = new byte[256];
        for (int i = 0; i < 256; i++) {
            bytes[i] = (byte) i;
        }
        String str = new String(bytes);//디폴트 charset에서 유효하지 않을 경우의 생성자 행위는 규정되어있지 않다.

        System.out.println("str.length() : " + str.length());//256
        System.out.println("str : " + str);
//         
// !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}~��������������������������������������������������������������������������������������������������������������������������������

        for (int i = 0, n = str.length(); i < n; i++) {
            System.out.println((int) str.charAt(i) + " ");//127 이후로는 65533가 출력된다.
        }
    }

    @Test
    void answer() throws UnsupportedEncodingException {
        byte bytes[] = new byte[256];
        for (int i = 0; i < 256; i++) {
            bytes[i] = (byte) i;
        }
        String str = new String(bytes, "ISO-8859-1");//디폴트 charset에서 유효하지 않을 경우의 생성자 행위는 규정되어있지 않다.

        System.out.println("str.length() : " + str.length());//256
        System.out.println("str : " + str);
// 
// !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}~ ¡¢£¤¥¦§¨©ª«¬­®¯°±²³´µ¶·¸¹º»¼½¾¿ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõö÷øùúûüýþÿ

        for (int i = 0, n = str.length(); i < n; i++) {
            System.out.println((int) str.charAt(i) + " ");//255까지 정상적으로 출력된다.
        }
        //교훈: 바이트 시퀀스를 스트링 객체로 변환시킬때 마다 명시적이든 아니든 캐릭터셋을 사용한다는 점
    }
}
