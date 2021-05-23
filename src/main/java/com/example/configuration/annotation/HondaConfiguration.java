package com.example.configuration.annotation;

import com.example.services.Brake;
import com.example.services.Car;
import com.example.services.Chassis;
import com.example.services.Clutch;
import com.example.services.Engine;
import com.example.services.Transmission;
import com.example.services.impl.Honda;
import com.example.services.impl.brake.HondaBrake;
import com.example.services.impl.chassis.HondaChassis;
import com.example.services.impl.clutch.HondaClutch;
import com.example.services.impl.engine.HondaEngine;
import com.example.services.impl.transmission.HondaTransmission;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HondaConfiguration {

    @Bean
    public Brake brake() {
        return new HondaBrake();
    }

    @Bean
    public Transmission transmission() {
        return new HondaTransmission();
    }

    @Bean
    public Chassis chassis() {
        return new HondaChassis();
    }

    @Bean
    public Clutch clutch() {
        return new HondaClutch();
    }

    @Bean
    public Engine engine() {
        return new HondaEngine();
    }

    @Bean
    public Car car(){
        return new Honda(brake(), engine(), clutch(), chassis(), transmission());
    }
}
