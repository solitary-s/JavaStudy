package com.aloneness.java.design.simple.factroy;

/**
 * 简单工厂
 *
 * 把实例化的操作单独放到一个类中，这个类就成为简单工厂类，让简单工厂来决定哪个具体子类实例化
 *
 * 这样能把客户类和具体子类实现解耦，客户不再需要知道有哪些子类以及应当实例化哪个子类。客户类往往有多个
 */
public class SimpleFactory {

    public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProduct1();
        } else if (type == 2) {
            return new ConcreteProduct2();
        }
        return new ConcreteProduct();
    }
}
