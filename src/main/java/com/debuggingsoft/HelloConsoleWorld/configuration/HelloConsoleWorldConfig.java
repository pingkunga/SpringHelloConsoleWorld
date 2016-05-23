package com.debuggingsoft.HelloConsoleWorld.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.debuggingsoft.HelloConsoleWorld.domain.HelloConsoleWorld;
import com.debuggingsoft.HelloConsoleWorld.domain.HelloConsoleWorldImpl;

@Configuration
public class HelloConsoleWorldConfig {
 
    @Bean(name="helloConsoleWorldBean")
    @Description("This is a sample HelloConsoleWorld Bean")
    public HelloConsoleWorld helloWorld() {
        return new HelloConsoleWorldImpl();
    }
 
}