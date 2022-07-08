package com.meteor.javapluzzlers.q71_q80;

import org.junit.jupiter.api.Test;

public class Q79 {

    @Test
    void wrong() {
        new Pet("Fido", "beef", "Woof").live();
    }

}

class Pet {
    public final String name;
    public final String food;
    public final String sound;

    public Pet(String name, String food, String sound) {
        this.name = name;
        this.food = food;
        this.sound = sound;
    }

    public void eat() {
        System.out.println(name + ": Mmmmm, " + food);
    }

    public void play() {
        System.out.println(name + ": " + sound + " " + sound);
    }

    public void sleep() {
        System.out.println(name + ": Zzzzz...");
    }

    public void live() {
        new Thread() {
            public void run() {
                while (true) {
                    eat();
                    play();
                    //sleep();//컴파일 에러
                }
            }
        }.start();
    }
}