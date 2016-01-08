package by.epam.gift.objects.cookie;

/**
 * @author natalynka
 */
public class Shortbread extends Cookie {

    public Shortbread(String name, int weight, int price) {
        super(true, false, name, weight, price);
    }

    @Override
    protected String getSweetType() {
        return "Shortbread";
    }
}