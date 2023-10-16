package application;
import data.*;

public class AnimalApp {
    public static void main(String[] args) {

        //menggunakan polimorpisme
        Animal animal = new Cat();
        animal.name = "Pus";
        animal.run();
    }
    
}
