package com.debuggingsoft.HelloConsoleWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.debuggingsoft.HelloConsoleWorld.configuration.HelloConsoleWorldConfig;
import com.debuggingsoft.HelloConsoleWorld.domain.HelloConsoleWorld;
 
public class AppMain {
 
    public static void main(String args[]) {
        //AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloConsoleWorldConfig.class);
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("helloconsoleworld-config.xml");
        HelloConsoleWorld bean = (HelloConsoleWorld) context.getBean("helloConsoleWorldBean");
        bean.sayHello("Spring 4.x XML Config by Chatri Ngambenchawong");
        context.close();
    }
 
}