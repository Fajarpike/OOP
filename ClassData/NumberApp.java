package ClassData;


//untuk data bukan primitif
public class NumberApp {
    
    public static void main(String[] args) {
        
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        double doubleValue = intValue.doubleValue();
        short shortValue = intValue.shortValue();

        //mengkonversi dari String ke Number 

        String angka1 = "10000";
        Integer angka = Integer.valueOf(angka1);
        System.out.println(angka);
    }
}
