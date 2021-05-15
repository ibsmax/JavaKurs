package Task4_part2;

public class Etc extends Sweets {
    private String type;

    public Etc(String brand, Integer price, Integer weight, String type) {
        super(brand, price, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "[ brand = " + getBrand() + ", weight = "+getWeight()+ ", price = "+getPrice() + ", type = " + type +"]";
    }
}
