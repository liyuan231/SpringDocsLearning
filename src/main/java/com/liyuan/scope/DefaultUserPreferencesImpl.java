package com.liyuan.scope;

import java.io.Serializable;

public class DefaultUserPreferencesImpl implements DefaultUserPreference {
    @Override
    public void sayHello() {
        System.out.println("hello!");
    }
}
