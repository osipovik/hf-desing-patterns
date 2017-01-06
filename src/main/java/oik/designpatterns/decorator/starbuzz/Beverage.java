package oik.designpatterns.decorator.starbuzz;

public abstract class Beverage {
    protected String description = "Unknown beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    };
}
