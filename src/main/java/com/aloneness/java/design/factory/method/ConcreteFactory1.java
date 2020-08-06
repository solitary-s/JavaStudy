package com.aloneness.java.design.factory.method;

import com.aloneness.java.design.simple.factroy.ConcreteProduct1;
import com.aloneness.java.design.simple.factroy.Product;

public class ConcreteFactory1 extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
