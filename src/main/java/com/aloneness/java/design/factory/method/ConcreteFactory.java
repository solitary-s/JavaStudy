package com.aloneness.java.design.factory.method;

import com.aloneness.java.design.simple.factroy.ConcreteProduct;
import com.aloneness.java.design.simple.factroy.Product;

public class ConcreteFactory extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
