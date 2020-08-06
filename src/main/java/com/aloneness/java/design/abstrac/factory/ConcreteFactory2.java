package com.aloneness.java.design.abstrac.factory;

public class ConcreteFactory2 extends AbstractFactory{

    @Override
    AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB2();
    }
}
