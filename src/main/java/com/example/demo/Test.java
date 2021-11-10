package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuantq1
 * @Description
 * @create 2021-11-10 23:57
 */
@RestController
public class Test {
    @GetMapping("/test")
    public String test(){
        return "测试测试";
    }
}
