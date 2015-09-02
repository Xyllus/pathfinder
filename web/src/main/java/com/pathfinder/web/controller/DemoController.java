package com.pathfinder.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pathfinder.web.service.SampleService;
import com.pathfinder.web.vo.Hello;

@Controller
@RequestMapping(value = "/demo")
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private SampleService sampleService;

    @RequestMapping("/hello")
    @ResponseBody
    public Hello hello() throws Exception {
        logger.info("hello called");
        Hello hello = new Hello();
        hello.setMessage("HELLO WORLD");
        
        logger.info("sql result: " + sampleService.getData());
        
        return hello;
    }
}
