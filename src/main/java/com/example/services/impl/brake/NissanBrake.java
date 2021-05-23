package com.example.services.impl.brake;

import com.example.services.Brake;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NissanBrake implements Brake {
    @Override
    public void doBreakWork() {
        log.info("Nissan brake");
    }
}
