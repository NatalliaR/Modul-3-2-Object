package by.epam.gift.objects.zephyr;

/**
 * @author natalynka
 */
public class PinkZephyr extends Zephyr {

    public PinkZephyr(String name, int weight, int price) {
        super(Color.PINK, name, weight, price);
    }

    @Override
    protected String getSweetType() {
        return "Pink Zephyr";
    }
}
