package com.example.services.impl.clutch;

import com.example.services.Clutch;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HondaClutch implements Clutch {

    @Override
    public void doClutchWork() {
        log.info("Honda clutch");
    }
}
