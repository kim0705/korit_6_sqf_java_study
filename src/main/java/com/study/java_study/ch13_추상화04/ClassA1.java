package com.study.java_study.ch13_추상화04;

public class ClassA1 extends ClassA{

    @Override
    public void print(InterfaceA interfaceA) { // 외부에서 객체 주입 // print()가 interfaceA(DepenencyIndecion라고 함)를 의존함
        System.out.println("A1 클래스에서 print 호출");
        interfaceA.test(); // 주입한 객체에 따라 달라짐
    }
}
