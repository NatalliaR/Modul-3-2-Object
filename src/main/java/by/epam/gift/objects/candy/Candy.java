package by.epam.gift.objects.candy;

import by.epam.gift.objects.Sweets;

/**
 * @author natalynka
 */
public abstract class Candy extends Sweets {

    public enum State {
        SOLID,
        SOFT,
        MEDIUM
    }

    private State state;
    private boolean hasFilling;

    protected Candy(State state, boolean hasFilling, String name, int weight, int price) {
        super(name, weight, price);

        this.state = state;
        this.hasFilling = hasFilling;
    }

    public State getState() {
        return state;
    }

    public boolean hasFilling() {
        return hasFilling;
    }
}
