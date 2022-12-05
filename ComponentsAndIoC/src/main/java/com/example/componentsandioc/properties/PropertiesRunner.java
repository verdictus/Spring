package com.example.componentsandioc.properties;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PropertiesRunner implements CommandLineRunner {

    @Autowired
    private MyProperties myProperties;

    @Value("${properties.prefix.myProperty3}")
    private String myProperty3;

    @Override
    public void run(String... args) throws Exception {

        log.info(myProperties.getMyProperty1());
        log.info(myProperties.getMyProperty2());
        log.info(myProperty3);
    }
}
