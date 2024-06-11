package com.study.java_study.ch09_2클래스04;

import java.util.Arrays;
import java.util.Scanner;

public class CarService {

    Scanner scanner = new Scanner(System.in);
    CarRepository carRepository = new CarRepository();

    public CarService() {

    }

    private String selectedMenu() {
        String[] menus = {"1", "2", "3", "4", "q"};
        String selectedMenu = null;

        while(true) {
            System.out.print("메뉴 선택: ");
            selectedMenu = scanner.nextLine();
            if(Arrays.binarySearch(menus, selectedMenu) > -1){ //
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }

        return selectedMenu;
    }

    public boolean run() {
        boolean isRun = true;

        System.out.println("[ 차량 관리 프로그램 ]");
        System.out.println("1. 차량 등록");
        System.out.println("2. 차량 검색");
        System.out.println("3. 차량 수정");
        System.out.println("4. 차량 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectedMenu();

            switch (selectedMenu) {
                case "1":
                    registerCar();
                    break;
                case "2":
                    searchCar();
                    break;
                case "3":
                    modify();
                    break;
                case "4":
                    remove();
                    break;
                case "q":
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
            System.out.println();

            return isRun;
        }


    private String emptyCheck(String title) {
        String value =  null;
        while(true) {
            System.out.println("차량 " + title + "을(를) 입력하세요.");
            value = scanner.nextLine();
            if (!value.isBlank()) {
                break;
            }
            System.out.println(title + "는 공백일 수 없습니다. 다시 입력해주세요.");
        }
        return value;
    }

    private String duplicateCarNum() {
        String carNum = null;
        while(true) {
            carNum = emptyCheck("번호");
            if(carRepository.findCarNum(carNum) == null) {
                break;
            }
            System.out.println("이미 등록된 차량입니다.");
        }
        return carNum;
    }

    private void registerCar() {
        System.out.println("[ 차량 등록 ]");
        String carNum = duplicateCarNum(); // 번호는 중복되면 안되니깐 중복체크까지
        String carName = emptyCheck("이름"); // 공백 체크(공백체크 할 때 입력받음)
        int carId = carRepository.autoIncrementCarId(); // 1번부터
        String carOwner = emptyCheck("주인"); // 공백 체크

        CarEntity carEntity = new CarEntity(carNum, carName, carOwner, carId);
        carRepository.saveCars(carEntity);
        System.out.println("차량 등록이 완료 되었습니다.");
    }

    private void searchCar() {
        System.out.println("[ 차량 검색 ]");

        System.out.println("1. 통합 검색");
        System.out.println("2. 차량 번호 검색");
        System.out.println("3. 차량 이름 검색");
        System.out.println("4. 차량 소유자 검색");
        System.out.print("옵션 선택: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.print("검색어 입력: ");
        String searchText = scanner.nextLine();
        CarEntity[] searchCars = carRepository.searchCars(option, searchText); // 배열인 이유는 검색결과로 배열을 읽어와서

        System.out.println("[ 검색 결과 ]");
        if(searchCars.length == 0) { // 검색된 결과가 없다면
            System.out.println("검색된 정보가 없습니다.");
            return;
        }
        for(CarEntity car : searchCars) {
            System.out.println(car.toString());
        }
    }

    private void remove() {
        System.out.println("[ 차량 삭제 ]");
        searchCar();
        System.out.print("삭제 할 차량 번호 입력: ");
        int removeCarId = scanner.nextInt();
        scanner.nextLine();
        CarEntity newCar = carRepository.findCarId(removeCarId); // 입력받은 carId가 등록된 차량에 있는지 확인
        if(newCar == null) {
            System.out.println("해당 번호는 존재하지 않습니다.");
            return;
        }
        carRepository.deleteCarId(removeCarId);
    }

    private void modify() {
        System.out.println("[ 차량 수정 ]");
        searchCar();
        System.out.println("수정할 차량 번호를 입력해주세요.");
        int modifyCarId = scanner.nextInt();
        scanner.nextLine();
        CarEntity car = carRepository.findCarId(modifyCarId);

        if(car == null) {
            System.out.println("해당 번호는 존재하지 않습니다");
            return;
        }
        System.out.println("< 차량 수정 정보 입력 >");

        for(int i = 0; i < 3 ; i++) {
            String selected = null;

            switch (i) {
                case 0:
                    System.out.println("차량번호를 수정하시겠습니까? y/n");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) { // equalsIgnoreCase()는 대소문자를 구분하지 않고 비교
                        String carNum = duplicateCarNum();
                        car.setCarNum(carNum);
                        break;
                    }
                    break;
                case 1:
                    System.out.println("차량이름을 수정하시겠습니까? y/n");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {
                        String carName = emptyCheck("이름");
                        car.setCarName(carName);
                        break;
                    }
                    break;
                case 2:
                    System.out.println("차량소유자를 수정하시겠습니까? y/n");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {
                        String carOwner = emptyCheck("소유자");
                        car.setCarOwner(carOwner);
                        break;
                    }

            }

        }

    }
}
