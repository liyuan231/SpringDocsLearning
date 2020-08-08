package com.liyuan.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ComplexObject {
    Properties  adminEmails;
    private List<Object> someList;
    private Map<Object,Object> someMap;
    private Set<Object> someSet;


    public void setAdminEmails(Properties adminEmails) {
        this.adminEmails = adminEmails;
    }

    public void setSomeList(List<Object> someList) {
        this.someList = someList;
    }

    public void setSomeMap(Map<Object, Object> someMap) {
        this.someMap = someMap;
    }

    public void setSomeSet(Set<Object> someSet) {
        this.someSet = someSet;
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "adminEmails=" + adminEmails +
                ", someList=" + someList +
                ", someMap=" + someMap +
                ", someSet=" + someSet +
                '}';
    }
}
