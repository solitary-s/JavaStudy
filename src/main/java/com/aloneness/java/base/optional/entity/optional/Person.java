package com.aloneness.java.base.optional.entity.optional;

import java.util.Optional;

/**
 * 使用Optional重构
 *
 * @author aloneness
 * @date 2020/6/19
 */
public class Person {
    /**
     * optional<T> 表示该变量可缺失，如果确实会返回 Optional.empty()，不会产生空指针
     */
    private Optional<Car> car;

    public void setCar(Optional<Car> car) {
        this.car = car;
    }

    public Optional<Car> getCar() {
        return car;
    }
}
