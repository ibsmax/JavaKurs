import java.util.ArrayList;

public class Task4_part1 {
    public static void main(String[] args) {
        /** Задание 4
         * Часть 1:
         * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
         * Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
         * Часть 2:
         * Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
         * У каждой сладости есть название, вес, цена и свой уникальный параметр.
         * Необходимо собрать подарок из сладостей. Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
         @author Pystogov Maxim
         */
        // Часть 1
        int min = -9;
        int max = 9;
        int elements_count = 20;
        double myMassive[] = new double[elements_count];
        ArrayList<Double> myArrayList = new ArrayList<Double>();
        System.out.print("Элементы массива: ");
        for (int i = 0; i < elements_count; i++) {
            double per = (double) (Math.random() * ((max - min) + 1)) + min;
            myMassive[i] = per;
            myMassive[i] = (Double) Math.floor(myMassive[i] * 100) / 100.0;
        }
        double maximum = myMassive[0];
        double minimum = myMassive[0];

        for (int i = 0; i < elements_count; i++) {

            if (minimum > myMassive[i]) {
                minimum = myMassive[i];
            }
            if (maximum < myMassive[i]) {
                maximum = myMassive[i];
            }
            System.out.print(myMassive[i] + " ");
            myArrayList.add(myMassive[i]);
            if (i == 19) {
                System.out.print("\n");
                System.out.print("\n" + "Максимальный элемент массива = " + maximum + "\n" + "Минимальный элемент массива = " + minimum + "\n" + "\n");
                for (int k = 0; k < myArrayList.size(); k++)
                    if (myArrayList.get(k) == maximum) {
                        double position1 = k;
                        double tmp = myMassive[(int) position1];
                        for (int m = 0; m < myArrayList.size(); m++)
                            if (myArrayList.get(m) == minimum) {
                                double position2 = m;
                                myMassive[(int) position1] = myMassive[(int) position2];
                                myMassive[(int) position2] = tmp;
                            }
                    }
                System.out.print("Массив после замены переменных: ");
                for (int n = 0; n < elements_count; n++) {
                    System.out.print(myMassive[n] + " ");
                }

            }
        }
    }
}
