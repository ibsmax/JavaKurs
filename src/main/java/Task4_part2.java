public class Task4_part2 {
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
        // Часть 2
        int Candy_price = Sweets.getPriceCandy();
        int Jellybean_price = Sweets.getPriceJellybean();
        int Kitkat_price = Sweets.getPriceKitkat();
        int total_price = Candy_price*2+Jellybean_price*3+Kitkat_price*2;
        int Candy_weight = Sweets.getWeightCandy();
        int Jellybean_weight = Sweets.getWeightJellybean();
        int Kitkat_weight = Sweets.getWeightKitkat();
        int total_weight = Candy_weight*2+Jellybean_weight*3+Kitkat_weight*2;
        System.out.println("Общая цена подарка = "+total_price+" руб");
        System.out.println("Общий вес подарка = "+total_weight+" гр");
    }
}
