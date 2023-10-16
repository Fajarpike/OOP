package application;


public class EqualsAPP {

    public static void main(String[] args) {
        
        String first = "Fajar";
        first = first + " " + "Pikekah";

        System.out.println(first);

        String second = "Fajar Pikekah";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));
    }

    
}
