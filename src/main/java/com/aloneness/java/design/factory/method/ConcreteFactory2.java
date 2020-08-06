package com.aloneness.java.design.factory.method;

import com.aloneness.java.design.simple.factroy.ConcreteProduct2;
import com.aloneness.java.design.simple.factroy.Product;

public class ConcreteFactory2 extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
