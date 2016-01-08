package by.epam.gift.objects;

import by.epam.gift.comparators.NameComparator;
import by.epam.gift.comparators.PriceComparator;
import by.epam.gift.comparators.WeightComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author natalynka
 */
public class Gift {

    private List<Sweets> sweets = new ArrayList<>();

    public Gift() {
    }

    public void addSweet(Sweets sweet) {
        sweets.add(sweet);
    }

    public int getTotalPrice() {
        int totalPrice = 0;

        for (Sweets sweet : sweets) {
            totalPrice += sweet.getPrice();
        }

        return totalPrice;
    }

    public int getTotalWeight() {
        int totalWeight = 0;

        for (Sweets sweet : sweets){
            totalWeight += sweet.getWeight();
        }

        return totalWeight;
    }

    public List<Sweets> getSweetsSortedByName() {
        List<Sweets> result = new ArrayList<>(sweets);
        Collections.sort(result, new NameComparator());
        return result;
    }

    public List<Sweets> getSweetsSortedByPrice() {
        List<Sweets> result = new ArrayList<>(sweets);
        Collections.sort(result, new PriceComparator());
        return result;
    }

    public List<Sweets> getSweetsSortedByWeight() {
        List<Sweets> result = new ArrayList<>(sweets);
        Collections.sort(result, new WeightComparator());
        return result;
    }
}
