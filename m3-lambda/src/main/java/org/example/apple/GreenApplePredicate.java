package org.example.apple;

public class GreenApplePredicate implements ApplePredicate{
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
