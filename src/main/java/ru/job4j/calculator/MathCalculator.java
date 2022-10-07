package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumOfSubAndDiv(double first,  double second) {
        return sub(first, second) + div(first, second);
    }

    public static double sumOfSumMyltiplySubAndDiv(double first, double second) {
        return sum(first, second) + multiply(first, second) + sub(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма расчета равна : " + sumAndMultiply(10, 20));
        System.out.println("Сумма расчета равна : " + sumOfSubAndDiv(10, 20));
        System.out.println("Сумма расчета равна : " + sumOfSumMyltiplySubAndDiv(10, 20));
    }

}
