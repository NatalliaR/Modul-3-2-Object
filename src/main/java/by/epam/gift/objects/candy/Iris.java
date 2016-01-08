package by.epam.gift.objects.candy;

/**
 * @author natalynka
 */
public class Iris extends Candy {

    public Iris(String name, int weight, int price) {
        super(State.MEDIUM, false, name, weight, price);
    }

    @Override
    protected String getSweetType() {
        return "Iris";
    }
}
