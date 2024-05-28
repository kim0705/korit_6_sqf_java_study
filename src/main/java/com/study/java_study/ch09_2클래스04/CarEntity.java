package com.study.java_study.ch09_2클래스04;

public class CarEntity {

    private int carNum;
    private String carName;
    private int carYear;
    private String carOwner;

    public CarEntity(int carNum, String carName, String carOwner, int carYear) {
        this.carNum = carNum;
        this.carName = carName;
        this.carOwner = carOwner;
        this.carYear = carYear;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
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
                ", carYear=" + carYear +
                ", carOwner='" + carOwner + '\'' +
                '}';
    }
}
