package com.liyuan.controller;

public class ThingOne {
    ThingTwo thingTwo;
    ThingThree thingThree;

    public ThingOne(ThingTwo thingTwo, ThingThree thingThree) {
        this.thingThree = thingThree;
        this.thingTwo = thingTwo;
    }

    public void test(){
        System.out.println(thingTwo+":"+thingThree);
    }
}
