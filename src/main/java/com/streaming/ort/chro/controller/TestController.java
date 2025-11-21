package com.streaming.ort.chro.controller;

import com.streaming.ort.chro.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("Test")
public class TestController {
    @Autowired
    private TestService service;
    @GetMapping(value = "/main")
    private String hiMethod(){
        return "Hi, i an cfo";
    }
}
