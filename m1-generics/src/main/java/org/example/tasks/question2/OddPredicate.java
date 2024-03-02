package org.example.tasks.question2;

public class OddPredicate implements UnaryPredicate<Integer>{
    @Override
    public boolean test(Integer obj) {
        return obj%2 == 1 ;
    }
}
