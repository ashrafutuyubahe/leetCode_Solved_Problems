package com.example.demo;

public class Car {


    private  String madeBy;
    private int  year;
    private String carModel;

    public Car(String madeBy, int year, String carModel) {
        this.madeBy = madeBy;
        this.year = year;
        this.carModel = carModel;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }


    public String updateCarModel(String newCarModel){
        return  this.carModel= newCarModel;

    }

    public String updateCarMadeYear(String newCarMadeYear){
        return  this.carModel= newCarMadeYear;

    }
    public String updateCarMadeBy(String newCarMadeBy){
        return  this.carModel= newCarMadeBy;

    }



    @Override
    public String toString() {
        return "car{" +
                "madeBy='" + madeBy + '\'' +
                ", year=" + year +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}
