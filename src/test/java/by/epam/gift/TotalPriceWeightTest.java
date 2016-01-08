package by.epam.gift;

import by.epam.gift.objects.Gift;
import by.epam.gift.objects.Sweets;
import by.epam.gift.objects.candy.Caramel;
import by.epam.gift.objects.cookie.Biscuit;
import by.epam.gift.objects.cookie.Shortbread;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author natalynka
 */
public class TotalPriceWeightTest {

    private static Sweets[] sweets = {
            new Biscuit("Biscuit", 10, 12),
            new Biscuit("Tort", 12, 13),
            new Biscuit("Yabloko", 20, 13),
            new Shortbread("Candy", 43, 32),
            new Caramel("Nota", 50, 14),
            new Biscuit("Nota", 13, 25)
    };

    @Test(dataProvider = "dataProviderForTotalPrice")
    public void testTotalPrice(Sweets[] sweets, int expectedResult) {

        Gift gift = new Gift();
        for (int i = 0; i < sweets.length; i++) {
            gift.addSweet(sweets[i]);
        }
        int result = gift.getTotalPrice();
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForTotalPrice")
    public Object[][] dataProviderForTotalPrice() {
        return new Object[][]{
                {new Sweets[]{
                        sweets[0],
                        sweets[1],
                        sweets[4]
                }, 39},
                {new Sweets[]{
                        sweets[2],
                        sweets[4],
                        sweets[5]
                }, 52}
        };
    }

    @Test(dataProvider = "dataProviderForTotalWeight")
    public void testTotalWeight(Sweets[] sweets, int expectedResult) {

        Gift gift = new Gift();
        for (int i = 0; i < sweets.length; i++) {
            gift.addSweet(sweets[i]);
        }
        int result = gift.getTotalWeight();
        Assert.assertEquals(result, expectedResult, "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForTotalWeight")
    public Object[][] dataProviderForTotalWeight() {
        return new Object[][]{
                {sweets, 148}
        };
    }
}
