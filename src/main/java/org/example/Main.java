package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context3 =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Moto moto = context3.getBean("moto", Moto.class);
        moto.go();
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
//        Car car2 = context2.getBean("customCar", Car.class);
//        Car car3 = context2.getBean("customCar", Car.class);
//
//        System.out.println(car2 == car3);
//        System.out.println(car2);
//        System.out.println(car3);
//
//        context2.close();
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
