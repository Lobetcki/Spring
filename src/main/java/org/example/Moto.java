package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Primary
@Component
@Scope("prototype")
public class Moto implements Transport{

    public Moto() {
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Moto: init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Moto: destroy");
    }

    @Override
    public void go() {
        System.out.println("Мотоцикл едет");
    }

}
