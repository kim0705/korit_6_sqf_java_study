package com.study.java_study.ch12_추상화03;

/*
    인터페이스
    1. 일반 클래스와 동일하게 정의할 수 없다.
    2. 일반 변수(멤버변수)는 정의 할 수 없다.
    3. 무조건 상수만 정의 할 수 있다.
    4. 일반 메소드(멤버메소드)를 정의하기 위해서는 default 키워드를 사용하여야한다.
    5. 추상 메소드를 정의 할 때 abstract 키워드를 생략 할 수 있다.
    6. 인터페이스 안에 정의되어 지는 모든 상수와 메소드들은 public 접근 지정자를 사용한다.
    7. 인터페이스와 인터페이스는 extends
    8. 인터페이스와 클래스는 implements
 */
public interface Authority {
    // public static final 생략
    String DEFAULT_ROLE = "ROLE_USER"; // 상수

    // public abstract  생략
    String getAuthority(); // 추상메소드

    // public 생략
     default void printAuthority() { // 여기서 default 접근지정자가 아니라 일반 메소드라는 의미
        System.out.println(DEFAULT_ROLE);
    }
}
