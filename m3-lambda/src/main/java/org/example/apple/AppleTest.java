package org.example.apple;

import java.util.ArrayList;
import java.util.List;

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

        filterApples(inventory, gp); 

        filterApples(inventory,hp);

    }


    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<Apple>();

        for (Apple apple : inventory) {
            if (p.test(apple)){
                result.add(apple);
            }
        }

        System.out.println(result);
        return result;
    }

}
