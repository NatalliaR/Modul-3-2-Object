package by.epam.gift.objects;

/**
 * @author natalynka
 */
public abstract class Sweets {

    private String name;
    private int price;
    private int weight;

    protected Sweets(String name, int weight, int price) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public int getWeight(){
        return weight;
    }

    public String getName() {
        return name;
    }

    protected abstract String getSweetType();

    public String getDescription() {
        return getSweetType() + ": " +
                "name: " + getName() + ", " +
                "price: " + getPrice() + ", " +
                "weight: " + getWeight();
    }
}
