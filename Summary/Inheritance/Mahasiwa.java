package Summary.Inheritance;

public class Mahasiwa extends Fakultas{
 
   public Mahasiwa(String name, String nip, String semester, String jurusan){
        super(name, nip, semester, jurusan);
    }
    
    public void sayHi(String nama){
        System.out.println("Hello " + nama + " saya mahasiswa baru nama saya " + this.name
        + " nip saya " + this.nip + " sekarang saya semester " + this.semester + 
        " di fakultas " + this.jurusan);
    }
}
