package org.example.apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(Color.RED, 180));
        inventory.add(new Apple(Color.GREEN, 190));
        inventory.add(new Apple(Color.RED, 220));
        inventory.add(new Apple(Color.GREEN, 300));
        inventory.add(new Apple(Color.RED, 230));

        GreenApplePredicate gp = new GreenApplePredicate();
        HeavyApplePredicate hp = new HeavyApplePredicate();

//        filterApples(inventory, gp);
//
//        filterApples(inventory,hp);

        System.out.println("-------------------");

        filterApples(inventory, apple -> apple.getColor().equals(Color.GREEN));  // use lambda expression instead of passing objects of different actions

        filterApples(inventory, apple -> apple.getWeight() > 200);  // lambda -> don't need GreenApplePredicate and HeavyApplePredicate classes anymore

    }


    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate){
        List<Apple> result = new ArrayList<Apple>();

        for (Apple apple : inventory) {
            if (predicate.test(apple)){
                result.add(apple);
            }
        }

        System.out.println(result);
        return result;
    }

}
