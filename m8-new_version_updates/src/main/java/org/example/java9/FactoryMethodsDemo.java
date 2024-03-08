package org.example.java9;

import java.util.*;

public class FactoryMethodsDemo {
    public static void main(String[] args) {

        // creating unmodifiable Collections before Java9

        List<String> myList = Collections.unmodifiableList(Arrays.asList("Java", "Python", "React"));
        System.out.println(myList);


        Set<String> mySet = Collections.unmodifiableSet(new HashSet<>(myList));
        System.out.println(mySet);


        System.out.println("-----------------");

        // creating unmodifiable Collections after Java9

        List<String> myCourses = List.of("Java", "C++", "Ruby");
        System.out.println(myCourses);

        Set<String> myProducts = Set.of("Java", "C++", "Ruby");
        System.out.println(myProducts);

        Map<String, Integer> myMap = Map.ofEntries(
          Map.entry("aaa", 1),
                Map.entry("bbb", 2),
                Map.entry("ccc", 3)

        );

        System.out.println(myMap);


    }
}
