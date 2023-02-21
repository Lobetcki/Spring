package org.example;


public class Person {

    private Transport transport;

    public void setCar(Transport transport) {
        this.transport = transport;
    }

    public void jumpedInCar(Car car) {
        System.out.println("Владелец сел в автомобиль");
        car.go();
    }

}
