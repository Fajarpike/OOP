package application;

public class StackTraceApp {

    public static void main(String[] args) {
        
        try{
            String[] name = {"Fajar", "Tita", "Aisyah"};
            System.out.println(name[3]);
        }
        catch(Throwable throwable){
           StackTraceElement[] stackTraceElement = throwable.getStackTrace();

           throwable.printStackTrace();
        }
    }
    
}
