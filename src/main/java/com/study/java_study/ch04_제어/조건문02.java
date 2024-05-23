package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String("a");
        String name = "김준일";   //값의 자료형 String
        String phone = "01093044062";    //값의 자료형 null

        StringUtils stringUtils = new StringUtils();

        if(stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return;     // 메서드 끝
        }

        if(stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비어있습니다.");
            return;
        }

        if(stringUtils.isEmpty(text)) {
            System.out.println("text이 비어있습니다.");
            return;
        }

        System.out.println(text);
        System.out.println(name);

        if(name == null || name.equals("a")) {
            System.out.println("name이 비어있습니다.");
        }

        if(phone == null || phone.equals("")) {
            System.out.println("phone이 비어있습니다.");
        }

        if(text == null || text.equals("a")) { // '=='은 주소값 비교. 'equals'는 값 비교
            System.out.println("text이 비어있습니다.");
        }

    }
}


