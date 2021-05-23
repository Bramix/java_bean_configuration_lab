package com.example.services.impl;


import com.example.services.Car;
import com.example.services.CarPark;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SimpleCarPark implements CarPark  {

    private final List<Car> cars;

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public void deleteCar(Car car) {
        cars.remove(car);
    }
}
