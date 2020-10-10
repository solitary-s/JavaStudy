package com.aloneness.java.proxy;

public class SmsServiceImpl implements SmsService{
    @Override
    public String send(String message) {
        System.out.println("send message: " + message);
        return message;
    }

    @Override
    public String show(String msg) {
        System.out.println("send msg: " + msg);
        return msg;
    }
}
