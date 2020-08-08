package com.liyuan.model;

import java.util.Map;

/**
 * non-singleton
 * @param <K>
 * @param <V>
 */
public class Command<K, V> {
    Map<K, V> map;

    public void setState(Map commandState) {
        this.map = commandState;
    }

    public Object execute() {
        return map;
    }
}
