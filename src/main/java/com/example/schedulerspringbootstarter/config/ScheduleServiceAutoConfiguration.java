package com.example.schedulerspringbootstarter.config;

import com.example.schedulerspringbootstarter.service.ScheduleService;
import com.example.schedulerspringbootstarter.service.ScheduleServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ScheduleService.class)
public class ScheduleServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public ScheduleService scheduleService(){
        return new ScheduleServiceImpl();
    }
}
