package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyNameMessageService.class);
       MyNameMessageService serviceMessage= ctx.getBean(MyNameMessageService.class);
        MyNameMessageService serviceMessage2= ctx.getBean(MyNameMessageService.class);
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(RandomTextMessageService.class);
        MyNameMessageService serviceRandom= ctx2.getBean(MyNameMessageService.class);
        MyNameMessageService serviceRandom2= ctx2.getBean(MyNameMessageService.class);
        System.out.println(serviceRandom.getMessage());
        System.out.println(serviceRandom.hashCode());
        System.out.println(serviceRandom2.hashCode());
        System.out.println(serviceMessage.getMessage());
        System.out.println(serviceMessage.hashCode());
        System.out.println(serviceMessage2.hashCode());

    }
}
