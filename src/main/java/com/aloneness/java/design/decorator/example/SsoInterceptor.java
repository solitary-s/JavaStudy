package com.aloneness.java.design.decorator.example;

public class SsoInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        String ticket = request.substring(1, 8);
        return "success".equals(ticket);
    }
}
