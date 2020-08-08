package com.liyuan.singleAndPrototype;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ReplacementComputeValue implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        String input = (String) args[0];
        return "method com.liyuan.singleAndPrototype.ReplacementComputeValue is invoked!";
    }
}
