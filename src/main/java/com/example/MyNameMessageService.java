package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"com.example"})
public class MyNameMessageService implements MessageService {
    String message = "Anna Zielińska";
    @Bean
    public String getMessage()
    {
        return message;
    }
}
