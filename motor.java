public class motor {

    String name;
    String clasifikasi;
    int price;

    motor(String name, String clasifikasi, int price){
        this.name = name;
        this.clasifikasi = clasifikasi;
        this.price = price;
    }

    motor(String name, String clasifikasi){
        this.name = name;
        this.clasifikasi = clasifikasi; 
    }


    void maju(String kecepatan){
        System.out.println("nama motor ini " + this.name + " berjenis " + this.clasifikasi +
        " mampu melaju dalam kecepatan " + kecepatan + " km/jam");

        
    }
    
}
