package com.aloneness.java.design.decorator;

public class Mocha extends CondimentDecprator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 2 + beverage.cost();
    }
}
