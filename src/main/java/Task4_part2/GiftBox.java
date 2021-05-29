
package Task4_part2;

public class GiftBox {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Candy",20,20,7);
        Jellybean jellybean1 = new Jellybean("Jellybean",12,10,"Green");
        Etc etc1 = new Etc("Etc", 9,15,"lollipops");
        Sweets [] giftBox = {candy1,jellybean1,etc1};
        System.out.println("Состав подарка:");
        int finalPrice = 0, finalWeight = 0;
        for (Sweets someSweets: giftBox) {
            System.out.println(someSweets.toString());
            finalPrice = finalPrice + someSweets.getPrice();
            finalWeight = finalWeight + someSweets.getWeight();
        }
        System.out.println("Общий вес подарка = " + finalWeight + " грамм");
        System.out.println("Общая стоимость подарка = " + finalPrice + " руб");
    }
}