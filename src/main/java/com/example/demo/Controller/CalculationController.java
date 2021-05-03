package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {
    @GetMapping("/")
    public int calculation(){
        return 0;
    }
}
