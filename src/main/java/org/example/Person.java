package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

//    @Autowired
    private Transport transport;

//    @Autowired
    public Person(@Qualifier("Moto") Transport transport) {
        this.transport = transport;
    }

//    @Qualifier("car")
//    @Autowired
    public void setCar(Transport transport) {
        this.transport = transport;
    }

    public void jumpedInCar() {
        System.out.println("Владелец сел в Транспорт");
        transport.go();
    }

}
