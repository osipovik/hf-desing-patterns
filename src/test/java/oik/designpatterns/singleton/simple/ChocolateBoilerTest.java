package oik.designpatterns.singleton.simple;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChocolateBoilerTest {
    @Test
    public void boilerTest() {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();

        boiler.fill();
        boiler.boil();

        assertEquals(ChocolateBoiler.getInstance(), boiler);
    }
}