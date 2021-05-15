package Task4_part2;

public class Jellybean extends Sweets {
    private String color;

    public Jellybean(String brand, Integer price, Integer weight, String color) {
        super(brand, price, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "[ brand = " + getBrand() + ", weight = "+getWeight()+ ", price = "+getPrice()+ ", color = " + color +"]";
    }
}
