package com.liyuan.controller;

import com.liyuan.service.ShowAllBeans;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowAllBeansController implements ApplicationContextAware {
    ApplicationContext applicationContext;

    @Autowired
    ShowAllBeans showAllBeans;

    @GetMapping("/showAllBeans")
    public String show() {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("springmvc容器中的beans：");
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
        return showAllBeans.show();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
