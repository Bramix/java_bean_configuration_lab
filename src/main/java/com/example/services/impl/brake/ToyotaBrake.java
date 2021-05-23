package com.example.services.impl.brake;

import com.example.services.Brake;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ToyotaBrake implements Brake {

    @Override
    public void doBreakWork() {
        log.info("Toyota brake");
    }
}
