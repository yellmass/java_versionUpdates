package org.example.java9;

import java.util.List;
import java.util.Scanner;

public class ModuleDemo {
    public static void main(String[] args) {

        System.out.println(Scanner.class.getModule());
        System.out.println(List.class.getModule());
        System.out.println(FactoryMethodsDemo.class.getModule());

    }
}
