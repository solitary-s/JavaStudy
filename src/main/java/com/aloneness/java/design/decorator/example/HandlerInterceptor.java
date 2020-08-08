package com.aloneness.java.design.decorator.example;

public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);

}
