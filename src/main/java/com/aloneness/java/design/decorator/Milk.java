package com.aloneness.java.design.decorator;

public class Milk extends CondimentDecprator{

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1 + beverage.cost();
    }
}
