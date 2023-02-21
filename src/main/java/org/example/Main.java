package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context3 =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

//        Moto moto = context3.getBean("moto", Moto.class);
//        moto.go();

        Person person = context3.getBean("person", Person.class);
        person.jumpedInCar();


        Car car1 = context3.getBean("car", Car.class);
        Car car2 = context3.getBean("car", Car.class);

        System.out.println(car1 == car2);
        System.out.println(car1);
        System.out.println(car2);


        Moto moto1 = context3.getBean("moto", Moto.class);
        Moto moto2 = context3.getBean("moto", Moto.class);

        System.out.println(moto1 == moto2);
        System.out.println(moto1);
        System.out.println(moto2);
//
        context3.close();

//        ClassPathXmlApplicationContext context1 =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//        ClassPathXmlApplicationContext context2 =
//                new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Car car1 = context1.getBean("customCar", Car.class);
//        Person person1 = context1.getBean("customPerson", Person.class);
//
//        car1.go();
//
//        person1.jumpedInCar(car1);
//
//        context1.close();
//
//        System.out.println();
//
//
//        System.out.println();
//
//        Car car4 = context3.getBean("customCar", Car.class);
//        Car car5 = context3.getBean("customCar", Car.class);
//
//        System.out.println(car4 == car5);
//        System.out.println(car4);
//        System.out.println(car5);
//        context3.close();




    }

}
