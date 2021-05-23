package com.example.services.impl.chassis;

import com.example.services.Chassis;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NissanChassis implements Chassis {
    @Override
    public void doChassisWork() {
        log.info("Nissan Chassis");
    }
}
