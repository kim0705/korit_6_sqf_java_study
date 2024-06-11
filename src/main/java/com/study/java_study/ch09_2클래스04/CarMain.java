package com.study.java_study.ch09_2클래스04;

import com.study.java_study.ch09_클래스04.BookService;

public class CarMain {

    public static void main(String[] args) {
        CarService carService = new CarService();

        System.out.println("[ 차량 관리 프로그램을 시작합니다]");

        while (carService.run()) {}

        System.out.println("[ 차량 관리 프로그램을 종료합니다.]");
    }
}
