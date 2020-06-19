package com.aloneness.java.base.optional.entity.optional;

import com.aloneness.java.base.optional.entity.Insurance;

import java.util.Optional;

/**
 * @author aloneness
 * @date 2020/6/19
 */
public class Car {

    /**
     * optional<T> 表示该变量可缺失，如果确实会返回 Optional.empty()，不会产生空指针
     */
    private Optional<Insurance> insurance;

    public Optional<Insurance> getInsurance() {
        return insurance;
    }

    public void setInsurance(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }
}
