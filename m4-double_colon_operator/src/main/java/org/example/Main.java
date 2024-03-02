package org.example;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Calculate c  = (x,y) -> System.out.println(x+y);

        c.calculate(2,3);
    }
}