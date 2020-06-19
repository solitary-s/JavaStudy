package com.aloneness.java.base.optional.study;


import com.aloneness.java.base.optional.entity.Insurance;
import com.aloneness.java.base.optional.entity.optional.Car;
import com.aloneness.java.base.optional.entity.optional.Person;

import java.util.Optional;

/**
 * Optional
 *
 * @author aloneness
 * @date 2020/6/19
 */
public class Main {
    public static void main(String[] args) {
        new Main().map();
    }

    public void map() {
        // 使用map映射
        Insurance insurance = new Insurance();
        insurance.setName("测试");

        Optional<Insurance> insurance1 = Optional.ofNullable(insurance);
        Optional<String> s = insurance1.map(Insurance::getName);

        // flatMap映射
        Person person = new Person();
        Optional<Person> p = Optional.of(person);
        String name = p.flatMap(Person::getCar).flatMap(Car::getInsurance).map(Insurance::getName).orElse("Unknow");
//        String name = p.flatMap(Person::getCar).orElse("Unknow");
        System.out.println(name);

    }

    public void create()  {
        // 创建Optional 空对象
        Optional<Car> empty = Optional.empty();

        Car car = new Car();
        // 非空值对象
        Optional<Car> car1 = Optional.of(car);

        // 可以接受空值对象
        Optional<Car> car2 = Optional.ofNullable(car);
    }
}
