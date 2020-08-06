package com.aloneness.java.design.chain;

public class Request {
    private RequestType requestType;

    private String name;

    public Request(RequestType requestType, String name) {
        this.requestType = requestType;
        this.name = name;
    }

    public RequestType getType() {
        return requestType;
    }

    public String getName() {
        return name;
    }
}
