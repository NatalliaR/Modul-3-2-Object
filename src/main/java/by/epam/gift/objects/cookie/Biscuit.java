package by.epam.gift.objects.cookie;

/**
 * @author natalynka
 */
public class Biscuit extends Cookie {

    public Biscuit(String name, int weight, int price) {
        super(false, true, name, weight, price);
    }

    @Override
    protected String getSweetType() {
        return "Biscuit";
    }
}
