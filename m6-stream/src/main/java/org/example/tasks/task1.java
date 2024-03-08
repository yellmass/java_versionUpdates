package org.example.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class task1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list = list.stream().map(p->p*p).collect(Collectors.toList());

        Optional<Integer> opt = list.stream().filter(p->p>1000).findAny();

        System.out.println(opt.isPresent() ? opt.get() : "There is no element" );

        System.out.println(list);
    }
}
