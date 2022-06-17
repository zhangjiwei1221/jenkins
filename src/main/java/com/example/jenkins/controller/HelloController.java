package com.example.jenkins.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author zjw
 * @date 2021/07/22
 */
@Api(tags = "demo")
@RestController
public class HelloController {

    @ApiOperation("helloGet")
    @GetMapping("/hello")
    public String helloGet() {
        return "hello";
    }

    @ApiOperation("helloPost")
    @PostMapping("/hello/{str}")
    public String helloPost(@PathVariable String str) {
        return "hello" + str;
    }

}
