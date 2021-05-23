package com.example.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public abstract class Car {
    private final Brake brake;
    private final Engine engine;
    private final Clutch clutch;
    private final Chassis chassis;
    private final Transmission transmission;

    public void doRide() {
        engine.doEngineWork();
        clutch.doClutchWork();
        chassis.doChassisWork();
        transmission.doTransmissionWork();
        brake.doBreakWork();
    }
}
