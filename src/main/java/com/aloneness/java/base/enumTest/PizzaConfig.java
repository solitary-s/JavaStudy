package com.aloneness.java.base.enumTest;

public enum PizzaConfig {
    INSTANCE;

    public static PizzaConfig getInstance() {
        return INSTANCE;
    }
}
