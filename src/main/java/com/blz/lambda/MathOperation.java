package com.blz.lambda;

@FunctionalInterface
interface IMathFunction {
    int calculate(int a, int b);
    static void printResult(int a, int b, String function, IMathFunction fobj) {
        System.out.println("Result of" + function + "is" +fobj.calculate(a, b));
    }
}
public class MathOperation {
    public static void main(String[] args) {
        IMathFunction add = Integer::sum;

        IMathFunction multiply = (x, y) -> x * y;
        IMathFunction divide = (int x, int y) -> x / y;
        IMathFunction sub = (x, y) -> x - y;

        IMathFunction.printResult( 6,  3,  "Addition", add);
        IMathFunction.printResult( 6,  3, "Multiplication", multiply);
        IMathFunction.printResult( 6,  3,  "Divide", divide);
        IMathFunction.printResult( 6,  3,  "Subtraction", sub);
    }
}
