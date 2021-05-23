package com.example.services;


import java.util.List;

public interface CarPark {

    List<Car> getCars();

    void addCar(Car car);

    void deleteCar(Car car);
}
