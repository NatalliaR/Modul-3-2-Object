package by.epam.gift.objects.candy;

/**
 * @author natalynka
 */
public class Caramel extends Candy {

    public Caramel(String name, int weight, int price) {
        super(State.SOLID, true, name, weight, price);
    }

    @Override
    protected String getSweetType() {
        return "Caramel";
    }
}
