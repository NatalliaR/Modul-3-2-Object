package by.epam.gift.objects.zephyr;

/**
 * @author natalynka
 */
public class WhiteZephyr extends Zephyr {

    public WhiteZephyr(String name, int weight, int price) {
        super(Color.WHITE, name, weight, price);
    }

    @Override
    protected String getSweetType() {
        return "White Zephyr";
    }
}
