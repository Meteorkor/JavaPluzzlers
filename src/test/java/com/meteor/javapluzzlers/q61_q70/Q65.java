package com.meteor.javapluzzlers.q61_q70;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class Q65 {

    @Test
    void wrong() {
        Random rnd = new Random();
        Integer[] arr = new Integer[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt();
        }

        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        Arrays.sort(arr, cmp);
        System.out.println(order(arr));//UNORDERED

    }

    enum Order {
        ASCENDING, DESCENDING, CONSTANT, UNORDERED
    }

    private Order order(Integer[] arr) {
        boolean ascending = false;
        boolean descending = false;

        for (int i = 1; i < arr.length; i++) {
            ascending |= (arr[i] > arr[i - 1]);
            descending |= (arr[i] < arr[i - 1]);
        }

        if (ascending && !descending) {return Order.ASCENDING;}

        if (descending && !ascending) {return Order.DESCENDING;}
        if (!ascending) {
            return Order.CONSTANT;
        }
        return Order.UNORDERED;
    }

}
