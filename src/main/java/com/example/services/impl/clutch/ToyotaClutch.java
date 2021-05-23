package com.example.services.impl.clutch;

import com.example.services.Clutch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ToyotaClutch implements Clutch {

    @Override
    public void doClutchWork() {
        log.info("Toyota Clutch");
    }
}
