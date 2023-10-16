package Summary.Encapsulation;

public class DatadiriAPP {
    
    public static void main(String[] args) {
        
        Datadiri data = new Datadiri();
        data.setNama("Fajar");
        System.out.println("Nama : "+ data.getNama());

        data.setNik("32178909808789");
        System.out.println("Nik : " + data.getNik());
    }
}
