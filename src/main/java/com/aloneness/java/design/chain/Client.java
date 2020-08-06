package com.aloneness.java.design.chain;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);
        Handler handler3 = new ConcreteHandler3(handler2);

        Request request1 = new Request(RequestType.TYPE1, "request1");
        Request request2 = new Request(RequestType.TYPE2, "request2");
        Request request3 = new Request(RequestType.TYPE3, "request3");
        Request request4 = new Request(RequestType.TYPE4, "request4");

        handler3.handleRequest(request2);
        handler3.handleRequest(request1);
        handler3.handleRequest(request3);
        handler3.handleRequest(request4);

    }
}
