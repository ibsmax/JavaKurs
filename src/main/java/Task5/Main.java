package Task5;

import javax.xml.stream.FactoryConfigurationError;
import java.util.InputMismatchException;
import java.util.Scanner;

import static Task5.Calculator.*;
import static Task5.Calculator.per2;

public class Main {
    /**
     * Задание 5 (Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.)
     *
     * @author Pystogov Maxim
     */
    public static void main(String[] args) throws InputMismatchException, NullPointerException, ClassCastException {
        try {
            Double per1 = InputNumber();
            char oper = ChoiceOperation();
            Double per2 = InputNumber();
            double res = Computation(per1, per2, oper);
            if (res == Double.POSITIVE_INFINITY ||
                    res == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();
            System.out.println("Результат вычисления: " + per1 + " " + oper + " " + per2 + " = " + res);
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



