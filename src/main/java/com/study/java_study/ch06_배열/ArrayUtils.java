package com.study.java_study.ch06_배열;

public class ArrayUtils {

    int findIndexByName(String[] names, String name) {
        for(int i = 0; i < names.length; i++) {
            if(names[i].equals(name)) {
                return i; // 인덱스 넘버 리턴
            }
        }
        return -1; // -1로 리턴하면 등록된 이름이 아니라는 의미로 사용
    }
}
