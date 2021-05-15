package Task4_part2;

import java.io.IOException;

public class GiftBox {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Candy",20,20,7);
        Jellybean jellybean1 = new Jellybean("Jellybean",12,10,"Green");
        Etc etc1 = new Etc("Etc", 9,15,"lollipops");
        Sweets [] giftBox = {candy1,jellybean1,etc1};
        System.out.println("Состав подарка:");
        for (Sweets someSweets: giftBox) {
            System.out.println(someSweets.toString());
        }
        System.out.print("Общий вес подарка = ");
        System.out.println(candy1.getWeight()+jellybean1.getWeight()+etc1.getWeight()+" грамм");
        System.out.print("Общая стоимость подарка = ");
        System.out.println(candy1.getPrice()+jellybean1.getPrice()+etc1.getPrice()+" руб");
    }
}
