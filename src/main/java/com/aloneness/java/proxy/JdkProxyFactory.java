package com.aloneness.java.proxy;

import sun.reflect.Reflection;

import java.lang.reflect.*;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Objects;

public class JdkProxyFactory {

    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new MessageInvocationHandler(target));
    }

    public static void main(String[] args) {
        SmsService smsService = (SmsService)JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("jdk动态代理");
        smsService.show("动态代理");
    }
}
