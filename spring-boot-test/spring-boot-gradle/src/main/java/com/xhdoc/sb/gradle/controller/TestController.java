package com.xhdoc.sb.gradle.controller;

import com.xhdoc.sb.gradle.listener.MessageListener;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/test")
@RequiredArgsConstructor
@RestController
public class TestController {
    //多个同type bean注入
    private final List<MessageListener> messageListenerList;

    @GetMapping("/list-bean")
    public String listBean() {
        for (MessageListener messageListener : messageListenerList) {
            messageListener.send("test name");
        }
        return "list bean test success" + messageListenerList.size();
    }
}
