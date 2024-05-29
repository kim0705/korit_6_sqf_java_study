package com.study.java_study.ch10_추상화01;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 11, "말티즈");
        Animal tiger = new Tiger("웅이", 5, 100); // 업캐스팅

        dog.move();
        tiger.move();
        ((Tiger)tiger).hunt(); //tiger.hunt는 업캐스팅 되어있으므로 쓸 수 없음 그래서 다운캐스팅 해줌
        dog.bark();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이", 11, "말티즈");
        animals[2] = new Tiger("웅이", 5, 100);

        for(Animal animal : animals) {
            animal.move();
        }

        System.out.println();

        /*
        for(Animal animal : animals) {
            if(animal instanceof Tiger) { // animal instanceof Tiger: animal이라는 객체가 Tiger의 인스턴스인가(원래 자료형이 Tiger였는지)
                Tiger t = (Tiger)animal; // 다운캐스팅
                t.hunt();
            } else if (animal instanceof  Dog) {
                Dog d = (Dog)animal; // 다운캐스팅
                d.bark();
            }
        }
         */

        for(Animal animal : animals) {
            if(animal.getClass() == Tiger.class) { // instanceof는 jdk 최근버전에서 사라져서 쓰는 방법 // 객체면 getclass()로 클래스 확인
                Tiger t = (Tiger)animal; // 다운캐스팅
                t.hunt();
            } else if (animal.getClass() == Dog.class) {
                Dog d = (Dog)animal; // 다운캐스팅
                d.bark();
            }
        }

    }
}
