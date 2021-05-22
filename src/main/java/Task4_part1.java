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
        int elements_count = 20;
        int min = -10;
        int max = 10;
        int myMassive[] = new int[elements_count];
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        System.out.print("Элементы массива: ");
        for (int i = 0; i < elements_count; i++) {
            int per = min + (int) (Math.random() * ((max - min) + 1));
            myMassive[i] = per;
        }
        int minimum_plus = 11;
        int maximum_minus = -11;

        for (int i = 0; i < elements_count; i++) {

            if (maximum_minus < myMassive[i] && myMassive[i] < 0) {
                maximum_minus = myMassive[i];
            }
            if (minimum_plus > myMassive[i] && myMassive[i] > 0) {
                minimum_plus = myMassive[i];
            }
            System.out.print(myMassive[i] + " ");
            myArrayList.add(myMassive[i]);
            if (i == 19) {
                System.out.print("\n");
                System.out.print("\n" + "Минимальный положительный элемент массива = " + minimum_plus + "\n" + "Максимальный отрицательный элемент массива = " + maximum_minus + "\n" + "\n");
                for (int k = 0; k < myArrayList.size(); k++)
                    if (myArrayList.get(k) == minimum_plus) {
                        int position1 = k;
                        int tmp = myMassive[position1];
                        for (int m = 0; m < myArrayList.size(); m++)
                            if (myArrayList.get(m) == maximum_minus) {
                                int position2 = m;
                                myMassive[position1] = myMassive[position2];
                                myMassive[position2] = tmp;
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
