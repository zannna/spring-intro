package com.example;

import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {
    String message = "Anna Zielińska";
    public String getMessage()
    {
        return message;
    }
}
