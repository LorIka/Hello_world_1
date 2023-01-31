package com.example_my_rest.my_rest;

public class HelloRest {
    public HelloRest(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    private final long id;
    private final String content;

}
