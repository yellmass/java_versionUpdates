package org.example;

import java.util.Arrays;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("JAVA", "CYDEO", "APPLE", "DEVELOPER");

        words.stream().forEach(p-> System.out.println(p + ": " + p.length()));
    }
}
