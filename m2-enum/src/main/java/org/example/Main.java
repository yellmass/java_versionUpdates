package org.example;

import static org.example.MathOperators.calculate;

public class Main {
    public static void main(String[] args) {

        System.out.println("How to access a constant");

        Currency a = Currency.PENNY;
        System.out.println(a);
        System.out.println(Currency.NICKLE);

        System.out.println("How to accesss all constants");

        Currency[] currencies = Currency.values();

        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        System.out.println("How to use switch statement in enum");

        Currency myMoney = Currency.DIME;

        switch (myMoney){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cents");
                break;
            case DIME:
                System.out.println("It is 10 cents");
                break;
            case QUARTER:
                System.out.println("It is 25 cents");
                break;
        }

        System.out.println("MathOperation Task");

        calculate(8,MathOperators.MINUS, 4);


    }
}
