package com.xhdoc.sb.gradle.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
@Slf4j
public class TestBean implements InitializingBean, DisposableBean {

    private String name;

    @Override
    public void destroy() throws Exception {
        log.warn("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.warn("after properties set");
    }
}
