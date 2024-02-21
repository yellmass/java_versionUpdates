package org.example;

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

        switch (myMoney){
            case PENNY:
                System.out.println(Currency.PENNY.getValue());
                break;
            case NICKLE:
                System.out.println(Currency.NICKLE.getValue());
                break;
            case DIME:
                System.out.println(Currency.DIME.getValue());
                break;
            case QUARTER:
                System.out.println(Currency.QUARTER.getValue());
                break;
        }

        System.out.println(Currency.QUARTER.ordinal());



        System.out.println("MathOperation Task");



        calculate(8,MathOperators.MINUS, 4);




    }

    public static void calculate(double num1, MathOperators operator ,double num2){
        switch (operator){
            case PLUS:
                System.out.println(num1+num2);
                break;
            case MINUS:
                System.out.println(num1-num2);
                break;
            case MULTIPLY:
                System.out.println(num1*num2);
                break;
            case DIVIDE:
                System.out.println(num1/num2);
                break;
        }

    }
}
