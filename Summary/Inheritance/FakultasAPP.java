package Summary.Inheritance;

public class FakultasAPP {

    public static void main(String[] args) {
        
        Fakultas fakultas;
        fakultas = new Fakultas("Universitas Subang");
        fakultas.sayHi("Fajar");

        Dosen dosen;
        dosen = new Dosen("Rakhmayudhi","Ilmu Komputer");
        dosen.sayHi("Restu");

        Mahasiwa mahasiswa;
        mahasiswa = new Mahasiwa("Fajar", "D1A.14.0001", "Delapan", "Ilmu Komputer");
        mahasiswa.sayHi("Rakhmayudhi");
    }
    
}
