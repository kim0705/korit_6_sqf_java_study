package com.study.java_study.ch10_추상화01;

public class Dog extends Animal{
    private String bread;

    public Dog() {
        super(); // Animal객체 생성자 호출(부모 객체 생성해줌), 항상 젤 위에 위치
        System.out.println("강아지 객체 생성");
    }

    public Dog(String name, int age, String bread) {
        super(name, age);
        this.bread = bread;
    }

    @Override // ctrl + o
    public void move() {
        System.out.println("강아지가 네발로 움직입니다.");
    }

    public void bark() {
        System.out.println(bread + "종의 강아지가 짖습니다.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "bread='" + bread + '\'' +
                '}';
    }
}
