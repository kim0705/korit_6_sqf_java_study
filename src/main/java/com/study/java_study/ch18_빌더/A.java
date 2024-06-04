package com.study.java_study.ch18_빌더;

public class A {

    public void test() {
        System.out.println("A 클래스 테스트");
    }

    public class B { // A의 내부 클래스. A가 생성이 되야 사용 가능

        public void print() {
            System.out.println("B 클래스 출력");
        }
    }

    public static class C {

        public void show() {
            System.out.println("C 클래스 조회");
        }

        public static void show2() {
            System.out.println("C 클래스 조회2");
        }
    }
}
