package com.aloneness.java.design.chain;

/**
 * 责任链 chain of responsibility
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链发送该请求，知道有一个对象
 * 处理它为止。
 *
 * Handler：定义处理请求的接口，并且实现后继链(successor)
 */
public abstract class Handler {

    protected Handler successor;

    public Handler(Handler handler) {
        this.successor = handler;
    }

    protected abstract void handleRequest(Request request);
}
