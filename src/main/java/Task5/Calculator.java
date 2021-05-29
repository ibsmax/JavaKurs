package Task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Calculator {
    public static Double per1;
    public static Double per2;

    public Calculator(Double per1, Double per2) {
        this.per1 = per1;
        this.per2 = per2;
    }

    public static Double GetResultAdditional(Double per1, Double per2) {
        return per1 + per2;
    }

    public static Double GetResultMultiplication(Double per1, Double per2) {
        return per1 * per2;
    }

    public static Double GetResultSubstraction(Double per1, Double per2) {
        return per1 - per2;
    }

    public static Double GetResultDivision(Double per1, Double per2) {
        return per1 / per2;
    }

    public static Double InputNumber() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        Double number = scanner.nextDouble();
        return number;
    }


    public static char ChoiceOperation() {
        System.out.println("Введите знак операции (+,-,/,*)");
        Scanner scanner = new Scanner(System.in);
        char oper = scanner.next().charAt(0);
        return oper;
    }

    public static Double Computation(double per1, double per2, char oper) {


        if (oper == '+') {
            double resultComputation = GetResultAdditional(per1, per2);
            return resultComputation;
        }
        if (oper == '-') {

            double resultComputation = GetResultSubstraction(per1, per2);
            return resultComputation;
        }
        if (oper == '/') {

            double resultComputation = GetResultDivision(per1, per2);
            return resultComputation;
        }
        if (oper == '*') {

            double resultComputation = GetResultMultiplication(per1, per2);
            return resultComputation;
        } else return null;
    }
}
