package com.liyuan.controller;

import com.liyuan.service.HelloService;
import com.liyuan.service.impl.HelloServiceImpl;

public class HelloController {

    HelloService helloService;

    public void testHelloService() {
        System.out.println(helloService);
    }

//    public HelloController(HelloService helloService) {
//        this.helloService = helloService;
//    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
//    public void setUserService(HelloService helloService) {
//        this.helloService = helloService;
//    }

}
