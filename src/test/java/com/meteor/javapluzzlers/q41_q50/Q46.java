package com.meteor.javapluzzlers.q41_q50;

import org.junit.jupiter.api.Test;

public class Q46 {

    @Test
    void wrong() {
        WronmgConfusing wronmgConfusing = new WronmgConfusing(null);//double array
        //오버로딩 메소드 찾는과정 두가지
        //1. 접근이 가능하고 적용이 가능한 모든 메소드나 생성자를 고른다.
        //2. 첫번째 단계에서 선별된 항목중 가장 구체적인 한개를 고른다.
        //가장 알맞는지 검사할때, 실제 파라미터를 사용해서 검사하지 않는다는것이 열쇠다.

        //가능한, 컴팡일러가 특저한 오버로딩을 선택하도록 강제하기 위해서 파라미터가 선언된 타입으로 캐스팅하라.

    }

    class WronmgConfusing {
        private WronmgConfusing(Object o) {
            System.out.println("Object");
        }

        private WronmgConfusing(double[] dArray) {
            System.out.println("double array");
        }
    }

}
