package org.example;

import java.util.ArrayList;

public class WildCardvsRawType {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<String>();
        names.add("Java");
// you can pass any type of ArrayList of to both methods
        printRawTypeList(names);
        printWildcardList(names);

    }


    public static void printRawTypeList(ArrayList rawType){
        rawType.add(101); // OK
        rawType.add("101"); // OK
        rawType.add(121.00); // OK
        for(Object obj : rawType){
            System.out.println(obj);
        }
    }
    public static void printWildcardList(ArrayList<?> unbounded){

        // since ? doesn't specify any type, you can simply use object
        for(Object obj : unbounded){
            System.out.println(obj);
        }

        //unbounded.add(101); // NOT OK
        //unbounded.add("101"); // NOT OK
        //unbounded.add(121.00); // NOT OK
    }
}
