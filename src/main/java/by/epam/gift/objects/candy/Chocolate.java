package by.epam.gift.objects.candy;

/**
 * @author natalynka
 */
public class Chocolate extends Candy {

    public Chocolate(String name, int weight, int price) {
        super(State.SOFT, true, name, weight, price);
    }

    @Override
    protected String getSweetType() {
        return "Chocolate";
    }
}
