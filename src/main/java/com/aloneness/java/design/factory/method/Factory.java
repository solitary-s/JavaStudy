package com.aloneness.java.design.factory.method;

import com.aloneness.java.design.simple.factroy.Product;

/**
 * 工厂方法
 *
 * 定义了一个创建对象的接口，但由于子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类
 *
 *
 *
 */
public abstract class Factory {

    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
    }

}
