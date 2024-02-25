package org.example.tasks;

import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {

        Integer[] a = {1,2,3,4,5};
        swap(a, 0,2);
        System.out.println(Arrays.toString(a));

    }

    public static <T> T[] swap(T[] array, int a, int b ){
        T temp =  array[a];
        array[a] = array[b];
        array[b] = temp;

        return array;
    }

}


