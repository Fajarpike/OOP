package data;

import data.Car;
import data.isMaintance;;

public class Avanza implements Car, isMaintance {

    public void drive() {
        System.out.println("Avanza Drive ");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintance() {
        return false;
    }

   

    
}
