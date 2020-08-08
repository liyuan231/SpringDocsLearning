package com.liyuan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;

@ComponentScan(value = {"com.liyuan"}, excludeFilters =
        {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})})
@ImportResource("classpath:spring.xml")
@Configuration
public class RootConfig {
}