package Task5;

import java.util.InputMismatchException;

import static Task5.Calculator.*;
import static Task5.Calculator.getPer2;

public class Main {
    /**
     * Задание 5 (Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.)
     *
     * @author Pystogov Maxim
     */
    public static void main(String[] args) throws InputMismatchException, NullPointerException, ClassCastException {
        try {
            double num1 = 1.5;
            double num2 = 2.0;
            Calculator.setPer1(num1);
            Calculator.setPer2(num2);
            double res = GetResultAdditional(getPer1(),getPer2());
            if (res == Double.POSITIVE_INFINITY ||
                    res == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();
            System.out.println("Результат вычисления: " + per1 + " + " + per2 + " = " + res);
        } catch (InputMismatchException e) {
            System.out.print("При вводе нецелого числа используйте запятые вместо точек, в качестве разделителя!");
        } catch (NullPointerException e) {
            System.out.print("Ошибка при вводе переменных!");
        } catch (ClassCastException e) {
            System.out.print("Выполнена неверная операция преобразования типов!");
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на 0 !");
        }
    }
}



