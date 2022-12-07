package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RandomTextMessageService implements MessageService{
    List<String> messages;
    public RandomTextMessageService()
    {
        messages= new ArrayList<>();
    }
    @Override
    public String getMessage() {
        for ( int i=0; i<10;i++)
        {
            messages.add(String.valueOf(i));
        }
        Random x= new Random();
        return   messages.get(x.nextInt(10));
    }
}
