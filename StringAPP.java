

public class StringAPP {
    
    /**
     * @param args
     */
    public static void main(String[] args) {

        String nama = "Fajar, Pikekah";
        String namaLowerCase = nama.toLowerCase();
        String namaUpperCase = nama.toUpperCase();

        System.out.println(nama);
        System.out.println(namaLowerCase);
        System.out.println(namaUpperCase);
        System.out.println(nama.length());
        System.out.println(nama.startsWith("Fajar"));
        System.out.println(nama.endsWith("wijaya"));

        String[] splitnama = nama.split(", ");
        for(String result : splitnama){
            System.out.println(result);
        }

        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        
        //untuk mendapatkan karakter tertentu
        System.out.println(namaLowerCase.charAt(5));
    }
}
