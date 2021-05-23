package com.example.services.impl.chassis;

import com.example.services.Chassis;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ToyotaChassis implements Chassis {

    @Override
    public void doChassisWork() {
        log.info("Toyota chassis");
    }
}
