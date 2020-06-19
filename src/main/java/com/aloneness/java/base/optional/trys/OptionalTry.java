package com.aloneness.java.base.optional.trys;

import com.aloneness.java.base.optional.entity.Car;
import com.aloneness.java.base.optional.entity.Insurance;
import com.aloneness.java.base.optional.entity.optional.Person;

/**
 * @author aloneness
 * @date 2020/6/19
 */
public class OptionalTry {
    public static void main(String[] args) {

//        Insurance insurance = new Insurance();
//        insurance.setName("车辆保险");
//        Car car = new Car();
//        car.setInsurance(insurance);
        Person person = new Person();
        System.out.println(person.getCar());
        System.out.println(person.getCar());

//        System.out.println(person.getCar().get().getInsurance().get().getName());
    }
}
