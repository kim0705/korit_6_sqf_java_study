package com.study.java_study.ch09_2클래스04;

public class CarEntity {

    private String carNum;
    private String carName;
    private int carId;
    private String carOwner;

    public CarEntity(String carNum, String carName, String carOwner, int carId) {
        this.carNum = carNum;
        this.carName = carName;
        this.carOwner = carOwner;
        this.carId = carId;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "carNum=" + carNum +
                ", carName='" + carName + '\'' +
                ", carId=" + carId +
                ", carOwner='" + carOwner + '\'' +
                '}';
    }
}
