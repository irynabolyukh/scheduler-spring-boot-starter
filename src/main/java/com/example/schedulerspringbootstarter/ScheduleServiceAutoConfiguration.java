package com.example.schedulerspringbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

@ConditionalOnClass(ScheduleService.class)
public class ScheduleServiceAutoConfiguration {

    @Bean
    public ScheduleService scheduleService(){
        return new ScheduleServiceImpl();
    }

}
