package by.epam.gift;

import by.epam.gift.comparators.NameComparator;
import by.epam.gift.objects.Gift;
import by.epam.gift.objects.Sweets;
import by.epam.gift.objects.candy.Caramel;
import by.epam.gift.objects.candy.Chocolate;
import by.epam.gift.objects.candy.Iris;
import by.epam.gift.objects.cookie.Biscuit;
import by.epam.gift.objects.cookie.Shortbread;
import by.epam.gift.objects.zephyr.PinkZephyr;
import by.epam.gift.objects.zephyr.WhiteZephyr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author natalynka
 */
public class Main {

    public static void main(String[] args) {

        Gift gift = new Gift();

        gift.addSweet(new Biscuit("Barny", 150, 7000));
        gift.addSweet(new Shortbread("BelVita", 250, 9000));

        gift.addSweet(new Caramel("Raspberry", 120, 4000));
        gift.addSweet(new Chocolate("Milka", 280, 10000));
        gift.addSweet(new Iris("Cream", 100, 5000));

        gift.addSweet(new PinkZephyr("Snow",90, 5500));
        gift.addSweet(new WhiteZephyr("Flower", 95, 5700));

        System.out.println("Total Weight: " + gift.getTotalWeight());
        System.out.println("Total Price: " + gift.getTotalPrice());

        System.out.println();

        System.out.println("Sweets sorted by name:");
        for (Sweets sweet : gift.getSweetsSortedByName()) {
            System.out.println(sweet.getDescription());
        }

        System.out.println();

        System.out.println("Sweets sorted by price:");
        for (Sweets sweet : gift.getSweetsSortedByPrice()) {
            System.out.println(sweet.getDescription());
        }

        System.out.println();

        System.out.println("Sweets sorted by weight:");
        for (Sweets sweet : gift.getSweetsSortedByWeight()) {
            System.out.println(sweet.getDescription());
        }
    }
}
