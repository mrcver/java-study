package com.xhdoc.sb.gradle.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EmailMessageListener implements MessageListener {
    @Override
    public void send(String name) {
        log.info("this is email message: {}", name);
    }
}
