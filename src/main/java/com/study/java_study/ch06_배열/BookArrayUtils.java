package com.study.java_study.ch06_배열;

public class BookArrayUtils {
    int findByName(String[] names,String name) {
        for(int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                return i;
            }
        }
        return -1;
    }
}
