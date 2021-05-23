package com.example.services.impl.engine;

import com.example.services.Engine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ToyotaEngine implements Engine {

    @Override
    public void doEngineWork() {
        log.info("Toyota engine");
    }
}
