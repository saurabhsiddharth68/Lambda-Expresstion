package com.blz.lambda;

public class MathOperationApp {
    public static void main (String[] args) {
        Interface add = (num1, num2) -> {System.out.println(num1+num2);};
        add.operation (5, 5);
        Interface multiplication = (a, b) -> {System.out.println(a*b);};
        add.operation (3, 5);
        Interface divide = (num1, num2) -> {System.out.println(num1/num2);};
        add.operation (10, 5);
        Interface subtraction = (a, b) -> {System.out.println(a-b);};
        add.operation (5, 5);
    }
}
