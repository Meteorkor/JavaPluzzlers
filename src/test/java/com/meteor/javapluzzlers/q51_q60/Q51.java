package com.meteor.javapluzzlers.q51_q60;

import org.junit.jupiter.api.Test;

public class Q51 {

    @Test
    void wrong() {
        System.out.println(new ColorPoint(4, 2, "purple"));//[4,2]:null
        //1. 서브 클래스의 생성자를 호출한다.

    }

    class Point {
        private final int x, y;
        private final String name;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
            name = makeName();//서브 클래스의 메소드를 호출한다.
        }

        protected String makeName() {
            return "[" + x + "," + y + "]";
        }

        public final String toString() {
            return name;
        }
    }

    class ColorPoint extends Point {

        private final String color;

        ColorPoint(int x, int y, String color) {
            super(x, y);//Point 생성자를 호출한다.
            this.color = color;//final 필드를 초기화 한다.
        }

        protected String makeName() {//서브 클래스의 생성자가 호출되기 전에 호출된다.
            return super.makeName() + ":" + color;
        }
    }

}
