package Task5;

import Task5.operations.Addition;
import Task5.operations.Division;
import Task5.operations.Multiplication;
import Task5.operations.Subtraction;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) throws InputMismatchException {
        /** Задание 7
         Добавить обработку исключений в задание с ООП калькуляторам (например, исключение может возникнуть при делении на ноль)
         Добавил обработку исключения при вводе точки вместо запятой для нецелых чисел.
         @author Pystogov Maxim
         */
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);

        try {
            Double per1 = scanner.nextDouble();
            System.out.println("Введите знак операции (+,-,/,*)");
            String oper = scanner.next();
            System.out.println("Введите второе число");
            Double per2 = scanner.nextDouble();
            if (oper.equals("+")) {
                Addition.setPer1(per1);
                Addition.setPer2(per2);
                System.out.println("Результат вычисления: " + per1 + " " + oper + " " + per2 + " = " + Addition.getResult(per1, per1));
            }
            if (oper.equals("-")) {
                Addition.setPer1(per1);
                Addition.setPer2(per2);
                System.out.println("Результат вычисления: " + per1 + " " + oper + " " + per2 + " = " + Subtraction.getResult(per1, per1));
            }
            if (oper.equals("/")) {
                Addition.setPer1(per1);
                Addition.setPer2(per2);
                System.out.println("Результат вычисления: " + per1 + " " + oper + " " + per2 + " = " + Division.getResult(per1, per1));
            }
            if (oper.equals("*")) {
                Addition.setPer1(per1);
                Addition.setPer2(per2);
                System.out.println("Результат вычисления: " + per1 + " " + oper + " " + per2 + " = " + Multiplication.getResult(per1, per1));
            }
        }
         catch (InputMismatchException e)
        {
            System.out.print("При вводе нецелого числа используйте запятые вместо точек, в качестве разделителя!");
        }
    }
}