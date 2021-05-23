package com.example.services.impl.engine;

import com.example.services.Engine;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HondaEngine implements Engine {

    @Override
    public void doEngineWork() {
        log.info("Honda engine");
    }
}
