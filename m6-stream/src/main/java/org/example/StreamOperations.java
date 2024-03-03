package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,4,6,9);
        list.forEach(System.out::println);

        list = list.stream().distinct().collect(Collectors.toList());

        System.out.println(list);

        List<Integer> list2 = Stream.of(3,5,7,2,0).map(p->p*2).collect(Collectors.toList());

        System.out.println(list2);

        int[] arr = {2,3,4,5,67,99,2,2};

        int[] uniqueArr = Arrays.stream(arr).distinct().toArray();

        System.out.println(Arrays.toString(uniqueArr));



    }

}
