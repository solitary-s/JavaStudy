package com.aloneness.java.proxy.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxyFactory {

    public static Object getProxy(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(clazz.getClassLoader());
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new AliMessageMethodInterceptor());
        return enhancer.create();
    }

    public static void main(String[] args) {
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("cglib动态代理");
    }
}
