package Annotation;

import data.Animal;
import data.Cat;

@Fancy(name = "Car", tags={"annotation", "java"})
public class FancyApp {
    
    @Fancy(name = "kucing", tags = {"Beajar java", "Annotation"})
    public static void main(String[] args) {

        //menggunakan polimorpisme
        Animal animal = new Cat();
        animal.name = "Pus";
        animal.run();
    }
}
