package com.aloneness.java.base.optional.trys;

import com.aloneness.java.base.optional.entity.Car;
import com.aloneness.java.base.optional.entity.Insurance;
import com.aloneness.java.base.optional.entity.Person;

/**
 * @author aloneness
 * @date 2020/6/19
 */
public class SecondTry {

    /**
     * 过多的退出语句
     *
     * @param person
     * @return
     */
    public String getInsurance(Person person) {

        if (person == null) {
            return "Unknown";
        }
        Car car = person.getCar();
        if (car == null) {
            return "Unknown";
        }
        Insurance insurance = car.getInsurance();
        if (insurance == null) {
            return "Unknown";
        }
        return insurance.getName();
    }
}
