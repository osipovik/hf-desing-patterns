package oik.designpatterns.decorator.starbuzz;

import oik.designpatterns.decorator.starbuzz.condiment.Milk;
import oik.designpatterns.decorator.starbuzz.condiment.Mocha;
import oik.designpatterns.decorator.starbuzz.condiment.Soy;
import oik.designpatterns.decorator.starbuzz.condiment.Whip;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BeverageTest {
    @Test
    public void DarkRoastWithMochaAndWhip() {
        /*Simple Dark Roast*/
        Beverage beverage = new DarkRoast();

        System.out.println(beverage.getDescription() + ": $" + beverage.cost());

        assertEquals(beverage.cost(), .99, 0);
        assertEquals(beverage.getDescription(), "Dark Roast");

        /* House Blend, Mocha, Mocha, Whip */
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription() + ": $" +
                BigDecimal.valueOf(beverage1.cost()).setScale(2, BigDecimal.ROUND_HALF_DOWN));

        assertEquals(BigDecimal.valueOf(beverage1.cost()).setScale(2, BigDecimal.ROUND_HALF_DOWN),
                BigDecimal.valueOf(1.39));
        assertEquals(beverage1.getDescription(), "House Blend, Mocha, Mocha, Whip");

        /* Decaf, Soy, Whip, Milk*/
        Beverage beverage2 = new Decaf();
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Milk(beverage2);

        System.out.println(beverage2.getDescription() + ": $" +
                BigDecimal.valueOf(beverage2.cost()).setScale(2, BigDecimal.ROUND_HALF_DOWN));

        assertEquals(BigDecimal.valueOf(beverage2.cost()).setScale(2, BigDecimal.ROUND_HALF_DOWN),
                BigDecimal.valueOf(1.40).setScale(2));
        assertEquals(beverage2.getDescription(), "Decaf, Soy, Whip, Milk");
    }
}