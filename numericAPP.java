public class numericAPP {

    public static void main(String[] args) {
        
        Integer angka1 = 10;

        Long angka2 = angka1.longValue();
        Double angka3 = angka2.doubleValue();
        Short angka4 = angka3.shortValue();

        //konversi dari string ke number
        String contoh1 = "10";
        Integer konversi1 = Integer.valueOf(contoh1);
        System.out.println(konversi1);

        System.out.println(angka2);
    }
    
}
