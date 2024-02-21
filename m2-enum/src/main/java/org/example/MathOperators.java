package org.example;

public enum MathOperators {
    PLUS,MINUS,MULTIPLY,DIVIDE;

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
