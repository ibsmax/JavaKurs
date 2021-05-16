package Task5;

import Task5.operations.Addition;
import Task5.operations.Division;
import Task5.operations.Multiplication;
import Task5.operations.Subtraction;

import java.io.IOException;
import java.util.Scanner;

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
            Addition.setPer1(per1);
            Addition.setPer2(per2);
            System.out.println("Результат вычисления: "+per1+ " "+oper+" "+per2+" = "+ Addition.getResult(per1, per1));
        }
        if (oper.equals("-")) {
            Addition.setPer1(per1);
            Addition.setPer2(per2);
            System.out.println("Результат вычисления: "+per1+ " "+oper+" "+per2+" = " + Subtraction.getResult(per1, per1));
        }
        if (oper.equals("/")) {
            Addition.setPer1(per1);
            Addition.setPer2(per2);
            System.out.println("Результат вычисления: "+per1+ " "+oper+" "+per2+" = " + Division.getResult(per1, per1));
        }
        if (oper.equals("*")) {
            Addition.setPer1(per1);
            Addition.setPer2(per2);
            System.out.println("Результат вычисления: "+per1+ " "+oper+" "+per2+" = " + Multiplication.getResult(per1, per1));
        }
    }
}
