package by.epam.gift;

import by.epam.gift.objects.Gift;
import by.epam.gift.objects.Sweets;
import by.epam.gift.objects.candy.Caramel;
import by.epam.gift.objects.cookie.Biscuit;
import by.epam.gift.objects.cookie.Shortbread;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author natalynka
 */
public class SweetsSortedTest {

    @Test
    public void testSweetsSortedByName() {

        Gift gift = new Gift();
        gift.addSweet(new Biscuit("Biscuit", 10, 12));
        gift.addSweet(new Biscuit("Tort", 12, 13));
        gift.addSweet(new Biscuit("Yabloko", 20, 17));
        gift.addSweet(new Shortbread("Candy", 43, 32));
        gift.addSweet(new Caramel("Nota", 50, 14));
        gift.addSweet(new Biscuit("Zero", 13, 25));

        List<Sweets> result = gift.getSweetsSortedByName();
        Assert.assertEquals(result.get(0).getName(), "Biscuit");
        Assert.assertEquals(result.get(1).getName(), "Candy");
        Assert.assertEquals(result.get(2).getName(), "Nota");
        Assert.assertEquals(result.get(3).getName(), "Tort");
        Assert.assertEquals(result.get(4).getName(), "Yabloko");
        Assert.assertEquals(result.get(5).getName(), "Zero");
    }

    @Test
    public void testSweetsSortedByPrice() {

        Gift gift = new Gift();
        gift.addSweet(new Biscuit("Biscuit", 10, 12));
        gift.addSweet(new Biscuit("Tort", 12, 13));
        gift.addSweet(new Biscuit("Yabloko", 20, 17));
        gift.addSweet(new Shortbread("Candy", 43, 32));
        gift.addSweet(new Caramel("Nota", 50, 14));
        gift.addSweet(new Biscuit("Zero", 13, 25));

        List<Sweets> result = gift.getSweetsSortedByPrice();
        Assert.assertEquals(result.get(0).getName(), "Biscuit");
        Assert.assertEquals(result.get(1).getName(), "Tort");
        Assert.assertEquals(result.get(2).getName(), "Nota");
        Assert.assertEquals(result.get(3).getName(), "Yabloko");
        Assert.assertEquals(result.get(4).getName(), "Zero");
        Assert.assertEquals(result.get(5).getName(), "Candy");
    }

    @Test
    public void testSweetsSortedByWeight() {

        Gift gift = new Gift();
        gift.addSweet(new Biscuit("Biscuit", 10, 12));
        gift.addSweet(new Biscuit("Tort", 12, 13));
        gift.addSweet(new Biscuit("Yabloko", 20, 17));
        gift.addSweet(new Shortbread("Candy", 43, 32));
        gift.addSweet(new Caramel("Nota", 50, 14));
        gift.addSweet(new Biscuit("Zero", 13, 25));

        List<Sweets> result = gift.getSweetsSortedByWeight();
        Assert.assertEquals(result.get(0).getName(), "Biscuit");
        Assert.assertEquals(result.get(1).getName(), "Tort");
        Assert.assertEquals(result.get(2).getName(), "Zero");
        Assert.assertEquals(result.get(3).getName(), "Yabloko");
        Assert.assertEquals(result.get(4).getName(), "Candy");
        Assert.assertEquals(result.get(5).getName(), "Nota");
    }
}
