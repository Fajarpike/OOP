package Summary.Inheritance;



public class KolotApp {

    public static void main(String[] args) {
        
       Budak budak = new Budak();
       budak.Hello("Fajar");

       Kolot kolot = (Kolot) budak;
       kolot.Hello("Jajang");

    }
    
}
