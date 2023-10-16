package ClassData;

public class StringApp {

    public static void main(String[] args) {
        
        String name = "Fajar Pikekah";

        String loweCase = name.toLowerCase();
        String upperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(loweCase);
        System.out.println(upperCase);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.startsWith("Fajar"));
        System.out.println(name.endsWith("Pikekah"));
        String[] split = name.split(" ");
       for(String nama : split){
        System.out.println(nama);

       }


    }
    
}
