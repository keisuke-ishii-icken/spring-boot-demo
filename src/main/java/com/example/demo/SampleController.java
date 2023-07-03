package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private final SampleService sampleService;

    @Autowired
    SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @RequestMapping("test")
    String test() {
        return sampleService.testService();
    }
}
