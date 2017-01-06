package oik.designpatterns.decorator.starbuzz.condiment;

import oik.designpatterns.decorator.starbuzz.Beverage;

public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
