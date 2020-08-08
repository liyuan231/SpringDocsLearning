package com.liyuan.model;

import java.util.Map;

public class SomeClass {
    private Map<String,Float> accounts;

    public void setAccounts(Map<String, Float> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "accounts=" + accounts +
                '}';
    }
}
