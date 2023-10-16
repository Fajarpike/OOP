package Util;

import java.util.InputMismatchException;

import data.LoginRequest;
import error.BlankException;
import error.ValidationException;
import data.LoginRequest;

public class ValidationUtil {

    public static void Validate(LoginRequest login) throws ValidationException, NullPointerException{

        if(login.getUsername() == null){
            throw new NullPointerException("Username is null");
        } else if(login.getUsername().isEmpty()){
            throw new ValidationException("Username is empty");
        }else if(login.getPassword() == null){
            throw new NullPointerException("Password is null");
        }else if(login.getPassword().isEmpty()){
            throw new ValidationException("Password is empty");
        }
    }
    
    public static void ValidateRuntime(LoginRequest login) {
        if(login.getUsername() == null){
            throw new NullPointerException("Username is null");
        } else if(login.getUsername().isEmpty()){
            throw new BlankException("Username is emplty");
        } else if(login.getPassword() == null){
            throw new NullPointerException("Password is null");
        } else if(login.getPassword().isEmpty()){
            throw new BlankException("Password is Empty");
        }
    }
}
