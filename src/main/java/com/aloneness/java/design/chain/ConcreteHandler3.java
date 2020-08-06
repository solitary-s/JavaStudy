package com.aloneness.java.design.chain;

public class ConcreteHandler3 extends Handler {

    public ConcreteHandler3(Handler successor) {
        super(successor);
    }


    @Override
    protected void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE3) {
            System.out.println(request.getName() + " is handle by ConcreteHandler3");
            return;
        }
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
