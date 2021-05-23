package com.example.services.impl;

import com.example.services.Brake;
import com.example.services.Car;
import com.example.services.Chassis;
import com.example.services.Clutch;
import com.example.services.Engine;
import com.example.services.Transmission;
import org.springframework.stereotype.Component;

@Component
public class Toyota extends Car {

    public Toyota(Brake brake,
                  Engine engine,
                  Clutch clutch,
                  Chassis chassis,
                  Transmission transmission) {
        super(brake, engine, clutch, chassis, transmission);
    }
}
