package com.aloneness.java.design.strategy.example.event;

import com.aloneness.java.design.strategy.example.Event;
import com.aloneness.java.design.strategy.example.EventHandle;
import com.aloneness.java.design.strategy.example.enums.Type;
import org.springframework.stereotype.Component;

@Component
@Event(Type.HANDLE)
public class HandleEventHandle implements EventHandle {
    @Override
    public void handle(String param) {
        System.out.println("HandleEventHandle...");
    }
}
