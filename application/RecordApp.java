package application;

import data.LoginRequest;
import error.ValidationException;
import Util.ValidationUtil;

public class RecordApp {
    
    public static void main(String[] args) {
        
        LoginRequest login = new LoginRequest("Fajar",null);

        login.setUsername("Fajar");
        System.out.println("Username : " + login.getUsername());
        
        login.setPassword(null);
        System.out.println("Password : " + login.getPassword());
        
       try{
        ValidationUtil.Validate(login);
        System.out.println("Data Valid");
       } catch(ValidationException |NullPointerException e) {
        System.out.println("Terjadi pesan error " + e.getMessage());
       } finally {
        System.out.println("Error tidak error, tetap di panggil");
       }

       LoginRequest loginRequest = new LoginRequest("Fajar", "Rahasia");
       ValidationUtil.ValidateRuntime(loginRequest);
       System.out.println("Sukses");
    }
}
