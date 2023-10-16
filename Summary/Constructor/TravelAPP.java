package Summary.Constructor;

public class TravelAPP {

    public static void main(String[] args) {
        
        Travel travel1 = new Travel("Subang", "Fajar");
        travel1.operasi("Bokir");

        Travel travel2 = new Travel("Fajar Trans", "Subang",40000);
        System.out.println("Nama Travel " + travel2.namaTravel);
        System.out.println("Tujuan Pemberangkatan : " + travel2.jurusan);
        System.out.println("Biaya ongkos jalan : " + travel2.price);

        Travel travel3 = new Travel("Bekasi");
        System.out.println("Travel ini menuju kota " + travel3.jurusan);

    }
    
}
