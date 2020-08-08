package com.aloneness.java.design.decorator.example;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoginSsoDecorator extends SsoDecorator{

    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }

    public LoginSsoDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        String ticket = request.substring(1, 8);
        boolean success = "success".equals(ticket);

        if (!success) {
            return false;
        }

        String userId = request.substring(9);
        String method = authMap.get(userId);
        return "queryUserInfo".equals(method);
    }

    public static void main(String[] args) {
        LoginSsoDecorator loginSsoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1success0huahua";
        boolean b = loginSsoDecorator.preHandle(request, "kjsadf", "h");
        System.out.println(b ? "放行" : "拦截");
    }
}
