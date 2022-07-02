package com.meteor.javapluzzlers.q41_q50;

import org.junit.jupiter.api.Test;

public class Q47 {

    @Test
    void wrong() {
        Dog dogs[] = new Dog[] { new Dog(), new Dog() };

        for (Dog dog : dogs) {
            dog.woof();
        }

        Cat cats[] = new Cat[] { new Cat(), new Cat(), new Cat() };
        for (Cat cat : cats) {
            cat.meow();
        }

        System.out.println("Dog.getCount() : " + Dog.getCount());//5
        System.out.println("Cat.getCount() : " + Cat.getCount());//5
        //static 필드는 static 필드를 선언한 클래스와 그 서브 클래스에서 공유된다.
    }

    class Counter {
        private static int count;

        public static void increment() {count++;}

        public static int getCount() {return count;}

    }

    class Dog extends Counter {
        public Dog() {

        }

        public void woof() {increment();}
    }

    class Cat extends Counter {
        public Cat() {

        }

        public void meow() {increment();}
    }

}
