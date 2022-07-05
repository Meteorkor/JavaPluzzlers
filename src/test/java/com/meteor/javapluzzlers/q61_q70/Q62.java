package com.meteor.javapluzzlers.q61_q70;

import java.util.IdentityHashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class Q62 {

    @Test
    void wrong() {
        Map<String, String> m = new IdentityHashMap<>();
        m.put("Mickey", "Mouse");
        m.put("Mickey", "Mantle");
        System.out.println(m.size());//1
        //교훈, 아이덴터티 기반의 비교를 필요로 하지 않는다면, IdentityHashMap을 사용하자 마라, 범용 목적의 Map 구현이 아니다.
        //직렬화나 깊은 복사같은 토폴로지를 보존하는 객체 그래프 변환을 구현하는 데 유용하다고 한다.
        //두번째 교훈은, 스트링 상수는 intern()되어 주소값이 같다는것
    }

}
