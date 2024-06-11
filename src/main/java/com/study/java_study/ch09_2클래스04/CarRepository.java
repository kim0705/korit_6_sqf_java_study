package com.study.java_study.ch09_2클래스04;


import com.study.java_study.ch09_클래스04.BookEntity;

import java.util.Arrays;

public class CarRepository {

    int carId;
    CarEntity[] cars;

    public CarRepository() {
        cars = new CarEntity[0];
    }

    public int autoIncrementCarId() {
        return ++carId;
    }

    public void extendCars() { // 배열 확장
        cars = Arrays.copyOf(cars, cars.length + 1);
    }

    public int getLastIndex() {
        return cars.length - 1;
    }

    public void saveCars(CarEntity car) {
        extendCars();

        cars[getLastIndex()] = car;
    }

    public CarEntity findCarNum(String carNum) {
        CarEntity findCar = null;

        for(CarEntity car : cars) {
            if(car.getCarNum().equals(carNum)) {
                findCar = car;
                break;
            }
        }
        return findCar;
    }

    public CarEntity findCarId(int carId) {
        CarEntity findCar = null;

        for(CarEntity car : cars) {
            if(car.getCarId() == carId) {
                findCar = car;
                break;
            }
        }
        return findCar;
    }

    private int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;

        switch (option) {
            case 1:
                for(CarEntity car : cars) {
                    if(car.getCarNum().contains(searchText)
                            || car.getCarName().contains(searchText)
                            || car.getCarOwner().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 2:
                for(CarEntity car : cars) {
                    if(car.getCarNum().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 3:
                for(CarEntity car : cars) {
                    if(car.getCarName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 4:
                for(CarEntity car : cars) {
                    if(car.getCarOwner().contains(searchText)) {
                        newArraySize++;
                    }
                }
        }
        return newArraySize;
    }

    public CarEntity[] searchCars(int option, String searchText) {
        int newArraysSize = getNewArraySize(option, searchText);

        CarEntity[] searchCars = new CarEntity[newArraysSize];
        int i = 0;

        switch (option) {
            case 1:
                for(CarEntity car : cars) {
                    if(car.getCarNum().contains(searchText)
                            || car.getCarName().contains(searchText)
                            || car.getCarOwner().contains(searchText)) {
                        searchCars[i] = car;
                        i++;
                    }
                }
                break;
            case 2:
                for(CarEntity car : cars) {
                    if(car.getCarNum().contains(searchText)) {
                        searchCars[i] = car;
                        i++;
                    }
                }
                break;
            case 3:
                for(CarEntity car : cars) {
                    if(car.getCarName().contains(searchText)) {
                        searchCars[i] = car;
                        i++;
                    }
                }
                break;
            case 4:
                for(CarEntity car : cars) {
                    if(car.getCarOwner().contains(searchText)) {
                        searchCars[i] = car;
                        i++;
                    }
                }
        }
        return searchCars;
    }

    private int indexOfCarId(int carId) {
        int findIndex = -1;

        for(int i = 0; i < cars.length; i++) {
            if(cars[i].getCarId() == carId) { // 삭제할 carId가 등록되있는 carId에 있는 경우
                findIndex = i;
                break;
            }
        }
        return findIndex; // 삭제할 carId리턴
    }

    public void deleteCarId(int carId) {
        int findIndex = indexOfCarId(carId);
        CarEntity[] deleteCar = new CarEntity[cars.length - 1];

        for(int i = 0; i < deleteCar.length; i++) {
            if(i < findIndex) {
                deleteCar[i] = cars[i];
                break;
            }
            deleteCar[i] = cars[i + 1];
        }
        cars = deleteCar;
    }
}