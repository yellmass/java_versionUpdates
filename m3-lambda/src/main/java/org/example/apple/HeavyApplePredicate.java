package org.example.apple;

public class HeavyApplePredicate implements ApplePredicate{

    public boolean test(Apple apple) {
        return apple.getWeight() > 200;
    }
}
