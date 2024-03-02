package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,0,30,10,99);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        System.out.println("---------------");

        Collections.sort(list, new MyComparator());

        System.out.println(list);

        List<Integer> list2 = Arrays.asList(2,0,3,1,9);

        Collections.sort(list2, (x,y)-> { // descending order
            if (x>y) return -1;
            if (x<y) return 1;
            return 0;
        });

        System.out.println(list2);

    }
}