package com.example.schedulerspringbootstarter;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceImpl implements ScheduleService, InitializingBean {
    @Override
    public void doSmth() {
        System.out.println("schedule starter");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Schedule service bean");
    }
}
