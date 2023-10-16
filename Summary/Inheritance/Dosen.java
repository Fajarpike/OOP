package Summary.Inheritance;

public class Dosen extends Fakultas {

    public Dosen(String name, String jurusan) {
        super(name, jurusan);
    }

    public void sayHi(String nama){
        System.out.println("Hello Mahasiswa baru " + nama + " Saya dosen fakultas " + 
        this.jurusan + " nama saya pak " + this.name);
    }

    
}
