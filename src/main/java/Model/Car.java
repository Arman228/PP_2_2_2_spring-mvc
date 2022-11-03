package Model;


import Service.CarserviceImpl;

import java.util.List;

public class Car {


    private String car_model;
    private int series;
    private String car_name;

    @Override
    public String toString() {
        return "Car{" +
                "car_model='" + car_model + '\'' +
                ", series=" + series +
                ", car_name='" + car_name + '\'' +
                '}';
    }

    public Car(String car_model, int series, String car_name) {
        this.car_model = car_model;
        this.series = series;
        this.car_name = car_name;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }


}
