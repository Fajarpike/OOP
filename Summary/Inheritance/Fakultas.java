package Summary.Inheritance;

public class Fakultas {

    public String name;
    String nip;
    String semester;
    public String jurusan;
    String kampus;

   public Fakultas(String name, String nip, String semester, String jurusan){
        this.name = name;
        this.nip = nip;
        this.semester = semester;
        this.jurusan = jurusan;
    }

    public Fakultas(String name, String jurusan){
        this.name = name;
        this.jurusan = jurusan;
    }
    public Fakultas(String Kampus){
        this.kampus = Kampus;
    }

    public void sayHi(String nama){
        System.out.println("Hello " + nama + " selamat datang di Kampus " + this.kampus);
    }
}
