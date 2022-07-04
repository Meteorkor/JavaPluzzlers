package com.meteor.javapluzzlers.q51_q60;

import org.junit.jupiter.api.Test;

public class Q55 {

    @Test
    void wrong() {
        for (int i = 0; i < 100; i++)
        //Creature creature = new Creature();//캄파일이 안된다.

        {
            System.out.println(Q55.Creature.numCreated());//100
        }

    }

    class Creature {
        private static long numCreated = 0;

        public Creature() {
            numCreated++;
        }

        public static long numCreated() {
            return numCreated;
        }
    }

}
