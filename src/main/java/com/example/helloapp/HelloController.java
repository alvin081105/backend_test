package com.example.helloapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "안녕";
    }

    @GetMapping("/about")
    public String about() {
        return "이건 백엔드 테스트 서비스입니다!";
    }

    @GetMapping("/error")
    public String error() {
        throw new RuntimeException("Error occurred");
    }
    




}

