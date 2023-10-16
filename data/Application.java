package data;

public class Application {

    public static final int PROCCESORS;

    static {
        System.out.println("Mengakses class application");
        PROCCESORS = Runtime.getRuntime().availableProcessors();
    }
    
}
