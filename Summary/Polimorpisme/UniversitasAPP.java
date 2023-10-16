package Summary.Polimorpisme;

import Summary.Inheritance.Dosen;
import Summary.Inheritance.Fakultas;
import Summary.Inheritance.Mahasiwa;

public class UniversitasAPP {

    public static void main(String[] args) {
        
        //Inilah bentuk dari polimorpisme
        Fakultas fakultas;
        fakultas = new Fakultas("Fajar","Ilmu Komputer");
        System.out.println("Nama Saya " + fakultas.name + " saya dari jurusan " + fakultas.jurusan);

        fakultas = new Dosen("Rakhmayudhi", "Ilmu Hukum");
        fakultas.sayHi("Caca");

        fakultas = new Mahasiwa("Diki", "D1A.14.008", "Delapan", "Ilmu Komunikasi");
        fakultas.sayHi("Agung");

        sayHi(new Dosen("Caca", "Ilmu Hukum"));
        sayHi(new Mahasiwa("Rega", "","",""));
        
    }

    static void sayHi(Fakultas fakultas){
        if(fakultas instanceof Dosen){
            //konversi
            Dosen dosen = (Dosen)fakultas;
            System.out.println("Halo saya seorang Dosen nama saya " + dosen.name + " dosen "+dosen.jurusan);
        }
        if(fakultas instanceof Mahasiwa){
            Mahasiwa mahasiswa = (Mahasiwa) fakultas;
            System.out.println("Halo saya seorang Mahasiswa " + mahasiswa.name);
        }
    }
    
}
