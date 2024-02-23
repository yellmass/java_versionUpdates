package org.example.question1;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Apple> inv = new ArrayList<Apple>();
        inv.add(new Apple(Weight.HEAVY,Color.RED, 201));
        inv.add(new Apple(Weight.LIGHT,Color.RED, 80));
        inv.add(new Apple(Weight.HEAVY,Color.GREEN, 230));
        inv.add(new Apple(Weight.LIGHT,Color.GREEN, 150));
        inv.add(new Apple(Weight.HEAVY,Color.RED, 250));

        prettyPrintApple(inv, apple -> "A " + apple.getWeight() + " " + apple.getColor() + " apple");

        System.out.println("------------------------");

        prettyPrintApple(inv, apple -> "An apple of " + apple.getNumericWeight() + "g");
    }

    public static void prettyPrintApple(List<Apple> inventory, PredicateApple predicateApple){
        for(Apple apple : inventory){
            String output = predicateApple.describe(apple);
            System.out.println(output);
        }
    }

}
