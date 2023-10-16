package data;

import java.util.Base64;

public class encode {

    public static void main(String[] args) {
        
        String input ="test Data";
        String encodeString = Base64.getEncoder().encodeToString(input.getBytes());
        System.out.println(encodeString);

        byte[] dataEncode = Base64.getDecoder().decode(encodeString);
        String hasil = new String(dataEncode);
        System.out.println(hasil);
    }
    
}
