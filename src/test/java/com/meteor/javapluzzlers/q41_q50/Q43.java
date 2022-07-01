package com.meteor.javapluzzlers.q41_q50;

import org.junit.jupiter.api.Test;

public class Q43 {

    @Test
    void wrong() {
        RuntimeException runtimeException = new RuntimeException();
//        Thread.currentThread().stop(runtimeException);//책에는 있지만 현재는 Throwable을 인자로 받는 stop()은 없음
        Thread.currentThread().stop();

//        java.lang.ThreadDeath
//        at java.base/java.lang.Thread.stop(Thread.java:942)
//        at com.meteor.javapluzzlers.q41_q50.Q43.wrong(Q43.java:9)
//        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    }

}
