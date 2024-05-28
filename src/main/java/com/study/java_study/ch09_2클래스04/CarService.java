package com.study.java_study.ch09_2클래스04;

import java.util.Scanner;

public class CarService {

    private CarRepository carRepository;
    private Scanner scanner;

    public CarService() {
        carRepository = new CarRepository();
        scanner = new Scanner(System.in);
    }

    public boolean run() {
        boolean isRun = true;


        System.out.println("[ 차량 관리 프로그램]");


    }
}
