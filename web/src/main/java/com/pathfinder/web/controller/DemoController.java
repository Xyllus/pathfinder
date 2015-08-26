package com.pathfinder.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pathfinder.web.vo.Hello;

@Controller
@RequestMapping(value = "/demo")
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/hello")
    @ResponseBody
    public Hello hello() {
        logger.info("hello called");
        Hello hello = new Hello();
        hello.setMessage("HELLO WORLD");
        return hello;
    }

}
