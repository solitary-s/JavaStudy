package com.aloneness.java.eight;

public class Test {
    public static void main(String[] args) {
        DefaultTest defaultTest = new DefaultTest() {
            @Override
            public int calculate(int a) {
                return a * a;
            }
        };
        int calculate = defaultTest.calculate(10);
        double sqrt = defaultTest.sqrt(calculate);
        System.out.println(sqrt);
    }
}
