package com.study.java_study.ch18_빌더;

public class Main {

    public static void main(String[] args) {
    // 내부 클래스
    A a = new A();
    A.B b = a.new B();

    a.test();
    b.print();

    A.C c = new A.C(); // C클래스가 static이므로 A를 생성하지 않고 사용 가능
    c.show(); // show()메소드는 static이 아니기 때문에 c를 생성해서 호출

    A.C.show2(); //show2()메소드는 static이기 때문에 바로 사용
    }
}
