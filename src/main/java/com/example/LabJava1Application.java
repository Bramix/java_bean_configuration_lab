package com.example;

import com.example.services.Car;
import com.example.services.CarPark;
import com.example.services.impl.Honda;
import com.example.services.impl.brake.HondaBrake;
import com.example.services.impl.chassis.HondaChassis;
import com.example.services.impl.clutch.HondaClutch;
import com.example.services.impl.engine.HondaEngine;
import com.example.services.impl.transmission.HondaTransmission;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class LabJava1Application implements CommandLineRunner {

    @Autowired
    private ApplicationContext appContext;

    public static void main(String[] args) {
        SpringApplication.run(LabJava1Application.class, args);
    }


    @Override
    public void run(String... args) {

        var simpleCarPark = appContext.getBean(CarPark.class);

        List<Car> cars = simpleCarPark.getCars();

        log.info("cars from carPark = {}", cars);

        log.info("deleting car");

        simpleCarPark.deleteCar(cars.get(0));

        log.info("cars from carPark = {}", simpleCarPark.getCars());

        log.info("adding car");
        simpleCarPark.addCar(new Honda(new HondaBrake(), new HondaEngine(), new HondaClutch(), new HondaChassis(), new HondaTransmission()));

        log.info("cars from carPark = {}", simpleCarPark.getCars());

    }
}
