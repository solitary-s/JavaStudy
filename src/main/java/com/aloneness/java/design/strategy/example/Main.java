package com.aloneness.java.design.strategy.example;

import com.aloneness.java.design.strategy.example.config.EventConfig;
import com.aloneness.java.design.strategy.example.enums.Type;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        EventContext bean = context.getBean(EventContext.class);
        bean.handle(Type.END, "1212");
    }
}
