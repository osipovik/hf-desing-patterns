package oik.designpatterns.factory.factory_method.ny;

import oik.designpatterns.factory.Pizza;
import oik.designpatterns.factory.factory_method.PizzaStore;
import oik.designpatterns.factory.factory_method.chicago.ChicagoPizzaStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaStoreTest {

    @Test
    public void pizzaStoreTest() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        assertEquals("NY style sauce and cheese pizza", pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
        assertEquals("Chicago style deep dish cheese pizza", pizza.getName());
    }
}