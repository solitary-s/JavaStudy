package com.aloneness.java.base.optional.trys;

import com.aloneness.java.base.optional.entity.Car;
import com.aloneness.java.base.optional.entity.Insurance;
import com.aloneness.java.base.optional.entity.Person;

/**
 * @author aloneness
 * @date 2020/6/19
 */
public class FirstTry {

    /**
     * 深层质疑
     * 这种方式，代码可读性非常差
     *
     * @param person
     * @return
     */
    public String getInsurance(Person person) {
        if (person != null) {
            Car car = person.getCar();
            if (car != null) {
                Insurance insurance = car.getInsurance();
                if (insurance != null) {
                    return insurance.getName();
                }
            }
        }
        return "Unknown";
    }

    /**
     * 获取保险名字的时候，很容易出现空指针
     *
     * @param person
     * @return
     */
    public String getInsuranceName(Person person) {
        return person.getCar().getInsurance().getName();
    }
}
