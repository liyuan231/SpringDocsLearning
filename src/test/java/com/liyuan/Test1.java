package com.liyuan;

import com.liyuan.controller.ExampleBean;
import com.liyuan.controller.HelloController;
import com.liyuan.controller.SimpleMovieLister;
import com.liyuan.controller.ThingOne;
import com.liyuan.model.*;
import com.liyuan.singleAndPrototype.MyValueCalculator;
import org.junit.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Test1 {

    @Test
    public void test1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) applicationContext.getBeanFactory();
//        beanFactory.registerSingleton("liyuan", new Liyuan());
        GenericBeanDefinition liyuanBeanDefinition = new GenericBeanDefinition();
//        liyuanBeanDefinition.setName
        liyuanBeanDefinition.setBeanClass(Liyuan.class);
        MutablePropertyValues liyuanProperties = new MutablePropertyValues();
        liyuanProperties.add("name", "liyuan");
        liyuanProperties.add("age", 19);
        liyuanBeanDefinition.setPropertyValues(liyuanProperties);
        beanFactory.registerBeanDefinition("liyuan", liyuanBeanDefinition);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        HelloController helloController = (HelloController) applicationContext.getBean("helloController");
        helloController.testHelloService();

        Object liyuan = applicationContext.getBean("liyuan");
        System.out.println(1);
//        applicationContext.get

    }

    @Test
    public void test2() {
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("spring.xml");
        context.refresh();
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        BeanFactory parentBeanFactory = applicationContext.getParentBeanFactory();
//      BeanFactory
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Object helloController5 = applicationContext.getBean("helloController5");
//        System.out.println("helloController bean:"+helloController5);
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
//        Introspector.decapitalize()
//        ClientService clientService =
    }

    @Test
    public void test4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        ThingOne thingOne = (ThingOne) applicationContext.getBean("thingOne");
        thingOne.test();
    }

    @Test
    public void test5() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        ExampleBean exampleBean = (ExampleBean) applicationContext.getBean("exampleBean");
        System.out.println(exampleBean.toString());

        SimpleMovieLister simpleMovieLister = (SimpleMovieLister) applicationContext.getBean("simpleMovieLister");
        simpleMovieLister.test();
    }

    @Test
    public void test6() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ExampleBean exampleBean = (ExampleBean) applicationContext.getBean("exampleBean");
        System.out.println(exampleBean.toString());
    }

    @Test
    public void test7() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void test8() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        ComplexObject complexObject = (ComplexObject) applicationContext.getBean("complexObject");
        ComplexObject child = (ComplexObject) applicationContext.getBean("child");
        System.out.println(complexObject.toString());
        System.out.println(child.toString());
//        Collection
    }

    @Test
    public void test9() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        SomeClass something = (SomeClass) applicationContext.getBean("something");
        System.out.println(something.toString());
    }

    @Test
    public void test10() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        ExampleBean exampleBean2 = (ExampleBean) applicationContext.getBean("exampleBean5");
        System.out.println(exampleBean2.toString());
    }

    @Test
    public void test11() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        for (int i = 0; i < 10; i++) {
//            Object command = applicationContext.getBean("command");
            CommandManager commandManager = (CommandManager) applicationContext.getBean("commandManager1");
            System.out.println("commandManager1:" + commandManager.getCommand());
//            System.out.println(command);
        }
    }
    @Test
    public void test12(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        MyValueCalculator myValueCalculator = (MyValueCalculator) applicationContext.getBean("myValueCalculator");
        System.out.println(myValueCalculator.computeValue("liyuan!"));
    }
}
