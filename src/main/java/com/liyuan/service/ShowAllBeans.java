package com.liyuan.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ShowAllBeans implements ApplicationContextAware {

    ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String show() {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("spring容器中的beans：");
        for(int i=0;i< beanDefinitionNames.length;i++){
            System.out.println(beanDefinitionNames[i]);
        }
        return Arrays.toString(beanDefinitionNames);
    }
}
