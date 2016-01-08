package by.epam.gift.comparators;

import by.epam.gift.objects.Sweets;

import java.util.Comparator;

/**
 * @author natalynka
 */
public class WeightComparator implements Comparator<Sweets> {

    @Override
    public int compare(Sweets o1, Sweets o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
