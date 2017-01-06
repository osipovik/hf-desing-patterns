package oik.designpatterns.factory.abstract_factory.pizzastore;

import oik.designpatterns.factory.abstract_factory.pizza.Pizza;
import oik.designpatterns.factory.abstract_factory.pizzastore.impl.ChicagoPizzaStore;
import oik.designpatterns.factory.abstract_factory.pizzastore.impl.NYPizzaStore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for abstract factory
 */
public class PizzaStoreTest {
    @Test
    public void pizzaStoreTest() {
        PizzaStore store = new NYPizzaStore();
        Pizza pizza = store.orderPizza("clam");
        System.out.println(pizza.getClam());
        assertEquals("Fresh clams", pizza.getClam().toString());

        store = new ChicagoPizzaStore();
        pizza = store.orderPizza("clam");
        System.out.println(pizza.getClam());
        assertEquals("Frozen clams", pizza.getClam().toString());
    }
}