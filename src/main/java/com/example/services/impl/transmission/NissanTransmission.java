package com.example.services.impl.transmission;

import com.example.services.Transmission;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NissanTransmission implements Transmission {

    @Override
    public void doTransmissionWork() {
        log.info("Nissan transmission");
    }
}
