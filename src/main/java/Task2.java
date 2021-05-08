import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /** Задание 2 (Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
         *  Использовать комментарии и JavaDoc при описании метода. Использовать форматирование при выводе результата в консоль.
         *  Полученный результат округлять до 4-х знаков после запятой.)
         @author Pystogov Maxim
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Введите первое число:");
                Scanner scanner2 = new Scanner(System.in);
                double per1 = scanner2.nextDouble();
                System.out.println("Введите второе число:");
                Scanner scanner3 = new Scanner(System.in);
                double per2 = scanner3.nextDouble();
                double result = per1 + per2;
                System.out.printf("Результат = " + "%.4f", result);
                break;
            case 2:
                System.out.println("Введите первое число:");
                Scanner scanner4 = new Scanner(System.in);
                per1 = scanner4.nextDouble();
                System.out.println("Введите второе число:");
                Scanner scanner5 = new Scanner(System.in);
                per2 = scanner5.nextDouble();
                result = per1 - per2;
                System.out.printf("Результат = " + "%.4f", result);
                break;
            case 3:
                System.out.println("Введите первое число:");
                Scanner scanner6 = new Scanner(System.in);
                per1 = scanner6.nextDouble();
                System.out.println("Введите второе число:");
                Scanner scanner7 = new Scanner(System.in);
                per2 = scanner7.nextDouble();
                result = per1 * per2;
                System.out.printf("Результат = " + "%.4f", result);
                break;
            case 4:
                System.out.println("Введите первое число:");
                Scanner scanner8 = new Scanner(System.in);
                per1 = scanner8.nextDouble();
                System.out.println("Введите второе число:");
                Scanner scanner9 = new Scanner(System.in);
                per2 = scanner9.nextDouble();
                result = per1 / per2;
                System.out.printf("Результат = " + "%.4f", result);
                break;
        }
        scanner.close();
    }
}
