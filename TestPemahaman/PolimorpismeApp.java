package TestPemahaman;

public class PolimorpismeApp {

    public static void main(String[] args) {

        Polimorpisme polimor;
        polimor = new Polimorpisme("Fajar");
        polimor.sayHi("Siti");

        polimorDua poliDua;
        poliDua = new polimorDua("Rizal");
        poliDua.sayHi("Ahmad");
        sayHi(new polimorDua("Revangga"));
    }

    static void sayHi(Polimorpisme polimor) {
        
        if(polimor instanceof polimorDua){
            polimorDua polidua = (polimorDua) polimor;
            System.out.println("Hi saya adalah bentuk polimorpisme " + polidua.name);
        }else {
            System.out.println("hello " + polimor.name);
        }
    }
    
}
