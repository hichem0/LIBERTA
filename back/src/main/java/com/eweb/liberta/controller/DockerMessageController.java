package com.eweb.liberta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerMessageController {

    @GetMapping("/messages")
    public String getMessage() {
        return "Hello from Docker!";
    }


    @GetMapping("/aaa")
    public String getAAA() {
        return "i got aaa!";
    }

}
