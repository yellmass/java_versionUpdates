package org.example.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(3,4);

        List<int[]> pairs = new ArrayList<>();

                numbers1.stream()
                .forEach(x->{
                    numbers2.stream()
                            .map(y->new int[]{x,y})
                            .forEach(array->pairs.add(array));
                });

        pairs.stream().forEach(p->System.out.println(Arrays.toString(p)));
    }
}
