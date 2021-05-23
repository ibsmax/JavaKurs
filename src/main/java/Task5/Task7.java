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
         catch (InputMismatchException e)
        {
            System.out.print("При вводе нецелого числа используйте запятые вместо точек, в качестве разделителя!");
        }
        catch (NullPointerException e)
        {
            System.out.print("Передаваемые значения не должны равнятся - null!");
        }
        catch (ClassCastException  e)
        {
            System.out.print("Выполнена неверная операция преобразования типов!");
        }
    }
}