package org.example.tasks.question2;

import javax.sql.rowset.Predicate;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> ci = Arrays.asList(1, 2, 3, 4, 7, 9);
        int count = countIf(ci, new OddPredicate() );
        System.out.println("Number of odd integers = " + count);
    }

    private static <T> int countIf(List<T> ci,  UnaryPredicate unaryPredicate) {
        int count = 0;
        for (T t : ci) {
            if (unaryPredicate.test(t)){
                count++;
            }
        }
        return count;
    }


}

/*
List<Integer> ci = Arrays.asList(1, 2, 3, 4);
int count = countIf(ci, new UnaryPredicate());
System.out.println("Number of odd integers = " + count);
 */
