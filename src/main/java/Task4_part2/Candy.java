package Task4_part2;

public class Candy extends Sweets {
    private Integer size;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Candy(String brand, Integer weight, Integer price, Integer size) {
        super(brand, price, weight);
        this.size = size;
    }
    @Override
    public String toString() {
        return "[ brand = " + getBrand() + ", weight = "+getWeight()+ ", price = "+getPrice()+ ", size = " + size +"]";
    }
}
