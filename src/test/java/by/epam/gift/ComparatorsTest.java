package by.epam.gift;

import by.epam.gift.comparators.NameComparator;
import by.epam.gift.comparators.PriceComparator;
import by.epam.gift.comparators.WeightComparator;
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
public class ComparatorsTest {

    @Test(dataProvider = "dataProviderForNameComparator")
    public void testNameComparator(Sweets o1, Sweets o2, int expectedResult) {
        NameComparator comparator = new NameComparator();
        int result = comparator.compare(o1, o2);
        Assert.assertEquals(normalize(result), normalize(expectedResult), "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForNameComparator")
    public Object[][] dataProviderForNameComparator() {
        return new Object[][]{
                {new Biscuit("Biscuit", 10, 12), new Biscuit("Tort", 12, 13), -1},
                {new Biscuit("Yabloko", 20, 13), new Shortbread("Candy", 43, 32), 1},
                {new Caramel("Nota", 50, 14), new Biscuit("Nota", 13, 25), 0},
        };
    }

    @Test(dataProvider = "dataProviderForPriceComparator")
    public void testPriceComparator(Sweets o1, Sweets o2, int expectedResult) {
        PriceComparator comparator = new PriceComparator();
        int result = comparator.compare(o1, o2);
        Assert.assertEquals(normalize(result), normalize(expectedResult), "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForPriceComparator")
    public Object[][] dataProviderForPriceComparator() {
        return new Object[][]{
                {new Biscuit("Biscuit", 10, 12), new Biscuit("Tort", 12, 13), -1},
                {new Biscuit("Yabloko", 50, 55), new Shortbread("Candy", 43, 32), 1},
                {new Caramel("Nota", 65, 25), new Biscuit("Nota", 30, 25), 0},
        };
    }

    @Test(dataProvider = "dataProviderForWeightComparator")
    public void testWeightComparator(Sweets o1, Sweets o2, int expectedResult) {
        WeightComparator comparator = new WeightComparator();
        int result = comparator.compare(o1, o2);
        Assert.assertEquals(normalize(result), normalize(expectedResult), "Invalid result of operation!");
    }

    @DataProvider(name = "dataProviderForWeightComparator")
    public Object[][] dataProviderForWeightComparator() {
        return new Object[][]{
                {new Biscuit("Biscuit", 10, 12), new Biscuit("Tort", 12, 13), -1},
                {new Biscuit("Yabloko", 50, 55), new Shortbread("Candy", 43, 32), 1},
                {new Caramel("Nota", 30, 40), new Biscuit("Nota", 30, 25), 0},
        };
    }

    private static int normalize(int value) {
        if (value < 0) {
            return -1;
        } else if (value > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
