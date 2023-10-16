package Summary.Interface;

public class BudiFamilyAPP {

    public static void main(String[] args) {
        
        Budi budi = new AnakBudi();
        Budi anakkeduaBudi = new AnakKeduaBudi();

        System.out.println(budi.name());
        System.out.println(budi.Tampan());
        System.out.println(budi.rajin());
        System.out.println(budi.pintar());
        budi.rajinSholat();
       


    }
    
}
