package Task5;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Task5.Calculator.*;
import static Task5.Calculator.GetResultDivision;

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
                System.out.println("Результат вычисления: "+per1+ " "+oper+" "+per2+" = "+ GetResultAdditional(per1, per2));
            }
            if (oper.equals("-")) {
                System.out.println("Результат вычисления: "+per1+ " "+oper+" "+per2+" = " + GetResultMultiplication(per1, per2));
            }
            if (oper.equals("/")) {
                System.out.println("Результат вычисления: "+per1+ " "+oper+" "+per2+" = " + GetResultSubstraction(per1, per2));
            }
            if (oper.equals("*")) {
                System.out.println("Результат вычисления: "+per1+ " "+oper+" "+per2+" = " + GetResultDivision(per1, per2));
            }
        }
         catch (InputMismatchException e)
        {
            System.out.print("При вводе нецелого числа используйте запятые вместо точек, в качестве разделителя!");
        }
    }
}