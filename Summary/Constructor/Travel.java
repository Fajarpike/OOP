package Summary.Constructor;

public class Travel {

    String namaTravel;
    String jurusan;
    int price;

    Travel(String nama, String tujuan, int price){
        this.namaTravel = nama;
        this.jurusan = tujuan;
        this.price = price;
    }

    Travel(String tujuan){
        this(tujuan, null);
       
    }

    Travel(String tujuan, String nama){
        this.namaTravel = nama;
        this.jurusan = tujuan;
    }

    Travel(){
        this(null);
    }

    void operasi(String name){
        System.out.println("Hi " + name + " ini adalah jasa travel " + this.namaTravel + " dengan tujuan rute " +
        this.jurusan);
    }
    
}
