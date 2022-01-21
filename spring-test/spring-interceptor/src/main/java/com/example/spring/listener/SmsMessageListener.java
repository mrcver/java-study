package com.example.spring.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SmsMessageListener implements MessageListener {
    @Override
    public void send(String name) {
        log.info("this is sms message: {}", name);
    }
}
