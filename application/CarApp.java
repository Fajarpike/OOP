package application;

import data.Car;
import data.Avanza;
import data.Bus;
import data.isMaintance;

public class CarApp {

    public static void main(String[] args) {
        
        Car car = new Avanza();
        car.drive();
        isMaintance maintenance = new Avanza();

        Car bus = new Bus();
        bus.drive();
        //object buss
        System.out.println(bus.getTire());
        System.out.println(bus.getBrand());
        System.out.println(bus.isMaintance());
        //objeck car
        System.out.println(car.getTire());
        System.out.println(car.getBrand());
        System.out.println(car.isBig());
        System.out.println(maintenance.isMaintance());

    }
    
}
