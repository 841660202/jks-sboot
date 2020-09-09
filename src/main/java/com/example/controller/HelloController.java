package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 海龙
 * @description
 * @date 2020-09-09 15:16:01
 */
@RestController
public class HelloController {
    @RequestMapping("/say")
    public String say() {
        return "Hello World! ...";

    }
}
