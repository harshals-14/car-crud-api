package com.harshal.car_crud_api.model;

public class Car {

    private Integer id ;
    private Integer price;
    private String carBrand;

    public Car() {

    }
//    public Car(int id, int price, String carBrand) {
//        this.id = id;
//        this.price = price;
//        this.carBrand = carBrand;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
