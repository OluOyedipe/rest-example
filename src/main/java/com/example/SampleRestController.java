package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by oo185005 on 4/17/17.
 */
@RestController
public class SampleRestController {

    @GetMapping("/hello")
    String sayHello() {
        return "hello";
    }
}
