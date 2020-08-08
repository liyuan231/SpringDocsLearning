package com.liyuan.controller;

import org.springframework.stereotype.Component;

//@Component
public class SomeThing {
    private String name;
    private Integer age;


    @Component
    static class OtherThing {
        private String name_;
        private Integer age_;
    }

}
