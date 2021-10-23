package com.blz.lambda;

@FunctionalInterface
interface IMathFunction {
    int calculate(int a, int b);
}
public class MathOperation {
    public static void main(String[] args) {
        IMathFunction add = Integer::sum;

        IMathFunction multiply = (x, y) -> x * y;
        IMathFunction divide = (int x, int y) -> x / y;
        IMathFunction sub = (x, y) -> x - y;


        System.out.println("Addition is " + add.calculate( 6, 3));
        System.out.println("Multiplication is " + multiply.calculate( 6,  3));
        System.out.println("Divide is " + divide.calculate( 6,  3));
        System.out.println("Subtraction is " + sub.calculate( 6,  3));


    }
}
