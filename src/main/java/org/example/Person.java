package org.example;

public class Person {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void jumpedInCar(Car car) {
        System.out.println("Владелец сел в автомобиль");
        car.go();
    }

}
