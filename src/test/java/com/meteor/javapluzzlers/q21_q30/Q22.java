package com.meteor.javapluzzlers.q21_q30;

import org.junit.jupiter.api.Test;

public class Q22 {
    @Test
    void wrong() {
        System.out.print("iexplore:");
        http://www.google.com;
        System.out.println(":maximize");//삭제되면 컴파일이 안됨..
        //iexplore::maximize
        //'http' 라는 레이블
    }

    @Test
    void answer() {
        System.out.print("iexplore:");
        http:                   //www.google.com;//goto가 없기 때문에 의미는 없지만, 사용하려면 충분히 혼동되지 않도록 작성하라

        System.out.println(":maximize");
        //iexplore::maximize
        //'http' 라는 레이블
    }
}
