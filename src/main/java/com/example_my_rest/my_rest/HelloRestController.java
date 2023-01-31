package com.example_my_rest.my_rest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping("/helloRest")
    public HelloRest helloRest(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        return new HelloRest("Hello, " + name + "!!!");
    }
}
