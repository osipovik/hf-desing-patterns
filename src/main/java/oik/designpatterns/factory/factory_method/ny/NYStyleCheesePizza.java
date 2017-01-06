package oik.designpatterns.factory.factory_method.ny;

import oik.designpatterns.factory.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY style sauce and cheese pizza";
        dough = "Thin crust dough";
        sauce = "Marinra sauce";

        toppings.add("Grated reggiano cheese");
    }
}
