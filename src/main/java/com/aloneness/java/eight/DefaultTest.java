package com.aloneness.java.eight;

public interface DefaultTest {

    public int calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
