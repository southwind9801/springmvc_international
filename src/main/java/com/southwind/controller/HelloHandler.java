package com.southwind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloHandler {
    @RequestMapping("/test")
    public String index() {
        return "index";
    }
}