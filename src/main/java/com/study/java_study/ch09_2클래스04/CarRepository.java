package com.study.java_study.ch09_2클래스04;

public class CarRepository {
    private CarEntity[] cars;

    public CarRepository() {
        CarEntity[] cars = new CarEntity[0];
    }

    private void extendCars() {
        CarEntity[] newCars = new CarEntity[cars.length + 1];

        for(int i = 0; i < cars.length; i++) {
            newCars[i] = cars[i];
        }
        cars = newCars;
    }

    public int lastIndex() {
        return cars.length - 1;
    }

    public void saveCar(CarEntity car) { //새로운 차량 저장
        extendCars();

        cars[lastIndex()] = car;
    }

    public int findCar(int carNum) { //차량 번호로 찾기
        for(CarEntity car : cars) {
            if(car.getCarNum() == carNum) {
              break;
            }
            System.out.println("등록되지 않은 차량입니다.");
        }
        return carNum;
    }

}
