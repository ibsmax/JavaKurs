package Task5;

import java.util.Scanner;

import static Task5.Calculator.*;

public class Main {
    /** Задание 5 (Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.)
     @author Pystogov Maxim
     */
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        Double per1 = scanner.nextDouble();
        System.out.println("Введите знак операции (+,-,/,*)");
        String oper = scanner.next();
        System.out.println("Введите второе число");
        Double per2 = scanner.nextDouble();
        if (oper.equals("+")) {
            Calculator.per1 = per1;
            Calculator.per2 = per2;
            System.out.println("Результат вычисления: "+per1+ " "+oper+" "+per2+" = "+ GetResultAdditional(Calculator.per1, Calculator.per2));
        }
        if (oper.equals("-")) {
            Calculator.per1 = per1;
            Calculator.per2 = per2;
            System.out.println("Результат вычисления: "+per1+ " "+oper+" "+per2+" = " + GetResultSubstraction(Calculator.per1, Calculator.per2));
        }
        if (oper.equals("/")) {
            Calculator.per1 = per1;
            Calculator.per2 = per2;
            System.out.println("Результат вычисления: "+per1+ " "+oper+" "+per2+" = " + GetResultDivision(Calculator.per1, Calculator.per2));
        }
        if (oper.equals("*")) {
            Calculator.per1 = per1;
            Calculator.per2 = per2;
            System.out.println("Результат вычисления: "+per1+ " "+oper+" "+per2+" = " + GetResultMultiplication(Calculator.per1, Calculator.per2));
        }
    }
}
