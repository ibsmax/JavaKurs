
package Task4_part2;

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
        int finalWeight =0;
        Integer[] weighttBox = {candy1.getWeight(),jellybean1.getWeight(),etc1.getWeight()};
        for (int i = 0; i < weighttBox.length; i++) {
            finalWeight=finalWeight+weighttBox[i];
        }
        System.out.print("Общий вес подарка = ");
        System.out.println(finalWeight+" грамм");
        int finalPrice =0;
        Integer[] prcietBox = {candy1.getPrice(),jellybean1.getPrice(),etc1.getPrice()};
        for (int i = 0; i < prcietBox.length; i++) {
            finalPrice=finalPrice+prcietBox[i];
        }
        System.out.print("Общая стоимость подарка = ");
        System.out.println(finalPrice+" руб");
    }
}