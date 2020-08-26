package com.aloneness.java.design.strategy.example;

import com.aloneness.java.design.strategy.example.enums.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class EventContext {

    private final Map<Type, EventHandle> eventHandleMap = new ConcurrentHashMap<>();

    @Autowired
    public EventContext(Map<String, EventHandle> eventContextMap) {
        this.eventHandleMap.clear();
        eventContextMap.forEach((key, value) -> {
            Event annotation = AnnotationUtils.findAnnotation(value.getClass(), Event.class);
            this.eventHandleMap.put(annotation.value(), value);
        });
    }

    public void handle(Type type, String param) {
        EventHandle eventHandle = eventHandleMap.get(type);
        eventHandle.handle(param);
    }
}
