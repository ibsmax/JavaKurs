package Task4_part2;

public abstract class Sweets {
    /**
     * Задание 4
     * Часть 2:
     * Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
     * У каждой сладости есть название, вес, цена и свой уникальный параметр.
     * Необходимо собрать подарок из сладостей. Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
     *
     * @author Pystogov Maxim
     */
    // Часть 2

    private String brand;
    private Integer price;
    private Integer weight;

    public Sweets(String brand, Integer price, Integer weight) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
