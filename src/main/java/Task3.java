import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /** Задание 3 (Поиск максимального элемента в массиве.
         * Для начала задать массив слов. Размерность массива произвольна, задается в консоли.
         * После чего в консоли вводятся слова в количестве равном заданной длине массива.
         * В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль.
         * Программа должна выполнять одно из заданий на выбор.
         * Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.)
         @author Pystogov Maxim
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите программу: 1 - калькулятор, 2 - поиск максимального слова в массиве");
        int action = scanner.nextInt();
        switch (action) {
            case 1:
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
                break;
            case 2:
                Scanner scanner10 = new Scanner(System.in);
                System.out.println("Введите длину массива слов");
                int length_mass = scanner10.nextInt();
                String myMassive[] = new String[length_mass];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < length_mass; i++) {
                    myMassive[i] = scanner.next();
                }
                String max_string = null;
                int max_count = 0;
                System.out.print("Элементы массива:");
                for (int i = 0; i < length_mass; i++) {
                    System.out.print(" " + myMassive[i] + " ");
                    int count = 0;
                    for (int s = 0; s < myMassive[i].length(); s++) {
                        count++;
                        if (count >= max_count) {
                            max_count = count;
                            max_string = myMassive[i];
                        }
                    }
                }
                System.out.print("\n" + "Самая длинная строка = " + max_string);
                break;
        }
        scanner.close();
    }
}
