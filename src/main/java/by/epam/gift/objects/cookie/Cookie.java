package by.epam.gift.objects.cookie;

import by.epam.gift.objects.Sweets;

/**
 * @author natalynka
 */
public abstract class Cookie extends Sweets {

    private boolean hasNuts;
    private boolean diabetic;

    protected Cookie(boolean hasNuts, boolean diabetic, String name, int weight, int price) {
        super(name, weight, price);

        this.hasNuts = hasNuts;
        this.diabetic = diabetic;
    }

    public boolean hasNuts() {
        return hasNuts;
    }

    public boolean isDiabetic() {
        return diabetic;
    }
}
