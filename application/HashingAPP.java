package application;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingAPP {

    public static void main(String[] args) {
        
        String input = "Rahasia Negara";

        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            md.update(input.getBytes());
            byte[] hashedBytes = md.digest();

            StringBuilder string = new StringBuilder();
            for(byte b : hashedBytes){
                string.append(String.format("%02x", b));
            }

            String hash = string.toString();
            System.out.println("Hashed value : " + hash);
            }catch(NoSuchAlgorithmException e){
                e.printStackTrace();
            }
    }
    
}
