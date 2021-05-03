package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AddController {

    @GetMapping("/add")
    public String add(int a, int b) {
        int val = a - b;
        return "您的计算结果为： " + val;
    }

    @PostMapping("/add")
    public String add(@RequestBody TestBody testBody) {
        int a = testBody.getA();
        int b = testBody.getB();
        int val = a - b;
        return "您的计算结果为： " + val;
    }
}
