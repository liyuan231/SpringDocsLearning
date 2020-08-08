package com.liyuan.controller;

public class ExampleBean {
    private int years;
    private String ultimateAnswer;
    private AnotherExampleBean beanOne;
    private YetAnotherBean beanTwo;
    private int integerProperty;

    //    @ConstructorProperties({"years_","ultimateAnswer_"})
    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    public ExampleBean() {
    }

    public ExampleBean(AnotherExampleBean beanOne) {
        this.beanOne = beanOne;
    }

    public ExampleBean(int years, String ultimateAnswer, AnotherExampleBean beanOne, YetAnotherBean beanTwo, int integerProperty) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
        this.beanOne = beanOne;
        this.beanTwo = beanTwo;
        this.integerProperty = integerProperty;
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
                "years=" + years +
                ", ultimateAnswer='" + ultimateAnswer + '\'' +
                ", beanOne=" + beanOne +
                ", beanTwo=" + beanTwo +
                ", integerProperty=" + integerProperty +
                '}';
    }

    public void setAnotherBean(AnotherExampleBean anotherBean) {
        this.beanOne = anotherBean;
    }

    public void setBeanTwo(YetAnotherBean beanTwo) {
        this.beanTwo = beanTwo;
    }

    public void setIntegerProperty(int integerProperty) {
        this.integerProperty = integerProperty;
    }

    public static ExampleBean createInstance(AnotherExampleBean anotherExampleBean, YetAnotherBean yetAnotherBean, int i) {
        ExampleBean exampleBean = new ExampleBean(19, "LIYUAN-*))>", anotherExampleBean, yetAnotherBean, i);
        return exampleBean;
    }
}
