package com.study.java_study.ch17_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapMain {

    public static void main(String[] args) {
        HashMap<Integer, String> strMap = new HashMap<>(); // Map: key값만 중복이 안됨, 순서 없음

        strMap.put(10, "김준일");
        strMap.put(11, "김준이");
        strMap.put(12, "김준삼");
        strMap.put(13, "김준사");

        System.out.println(strMap);

        System.out.println(strMap.get(11));

        Map<String, String> lang = Map.of(
                "java", "자바",
                "c", "C",
                "python", "파이썬",
                "js", "자바스크립트"
        );

        System.out.println(lang);

        System.out.println(lang.get("java")); // key값으로 값 가져오기

        Set<Map.Entry<String, String>> entries = lang.entrySet(); // key-value값을 묶어서 entity로 만들어서 Set으로 만들어줌
                                                                  // Map(lang)에 entrySet() 함수를 사용하여 Map의 전체 key-value값을 Set에 저장해 반환

        for(Map.Entry<String, String> entry : entries) { // Set은 반복이 가능하니깐 Map(반복을 지원하지 않음)에서 Set으로 변환해서 for-each로 반복
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }

    }
}
