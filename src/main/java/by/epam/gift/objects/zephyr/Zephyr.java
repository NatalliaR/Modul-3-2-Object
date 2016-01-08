package by.epam.gift.objects.zephyr;

import by.epam.gift.objects.Sweets;

/**
 * @author natalynka
 */
public abstract class Zephyr extends Sweets {

    public enum Color {
        PINK,
        WHITE
    }

    private Color color;

    protected Zephyr(Color color, String name, int weight, int price) {
        super(name, weight, price);

        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
