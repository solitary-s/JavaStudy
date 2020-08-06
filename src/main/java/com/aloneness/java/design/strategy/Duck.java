package com.aloneness.java.design.strategy;

/**
 * Context【Duck】 使用到该算法族的类，其中的doSomething()【performQuack()】会调用behavior(),
 * setStrategy(strategy)方法可以动态地改变strategy对象。也就是说能动态地改变Context所使用的算法
 *
 */
public class Duck {

    private QuackBehavior quackBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }
}
