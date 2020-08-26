package com.aloneness.java.design.strategy.example;

import com.aloneness.java.design.strategy.example.enums.Type;

import java.lang.annotation.*;

/**
 * 类型注解
 *
 * @author aloneness
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Event {

    Type value();
}
