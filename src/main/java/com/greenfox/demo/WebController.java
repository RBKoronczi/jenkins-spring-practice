package com.greenfox.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
}
