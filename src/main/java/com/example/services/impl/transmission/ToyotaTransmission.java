package com.example.services.impl.transmission;

import com.example.services.Transmission;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ToyotaTransmission implements Transmission {

    @Override
    public void doTransmissionWork() {
        log.info("Toyota transmission");
    }
}
