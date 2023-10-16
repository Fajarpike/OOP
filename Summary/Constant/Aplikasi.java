package Summary.Constant;

public class Aplikasi {

    public static final int PROCCESOR;

    static {
        System.out.println("Mengakses class Aplikasi");
        PROCCESOR = Runtime.getRuntime().availableProcessors();
    }
    
}
