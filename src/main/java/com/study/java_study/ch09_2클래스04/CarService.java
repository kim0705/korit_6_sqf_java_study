package com.study.java_study.ch09_2클래스04;

import java.util.Scanner;

public class CarService {

    private CarRepository carRepository;
    private Scanner scanner;

    public CarService() {
        carRepository = new CarRepository();
        scanner = new Scanner(System.in);
    }

    private String selectMenu() {
        String menu = "1234q";
        String selectedMenu = null;

        while(true) {
            System.out.println("메뉴 선택: ");
            selectedMenu = scanner.nextLine();

            if (menu.contains(selectedMenu)) {
                break;
            }
            System.out.println("잘못된 입력입니다.");
            break;
        }
        return selectedMenu;
    }

    public boolean run() {
        boolean isRun = true;

        System.out.println("[ 차량 관리 프로그램]");
        System.out.println("1. 차량 등록");
        System.out.println("2. 차량 조회");
        System.out.println("3. 차량 수정");
        System.out.println("4. 차량 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu();

        switch(selectedMenu) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "q":
                isRun = false;
                break;
            default:
                System.out.println("입력 오류!");
        }
        return isRun;
    }

    private void registerCar() {
        System.out.println("[ 차량 등록]");
    }

    private void searchCar() {
        System.out.println("[ 차량 검색 ]");
        System.out.println("1. 통합 검색");
        System.out.println("2. 차량명 검색");
        System.out.println("3. 차량번호 검색");
        System.out.println("4. 소유자 검색");
        System.out.println("옵션 선택: ");
        int option = scanner.nextInt();
    }
}
