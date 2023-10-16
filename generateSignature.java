import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONValue;

public class generateSignature {

    public static void main(String[] args) {

            jwt();
            payloads();
            
       
    
    }

    static void jwt() {
        Map jwt = new HashMap<>();

        jwt.put("alg","HS256");
        jwt.put("typ","JWT");

        String datajwt = JSONValue.toJSONString(jwt);
        
        try {
            MessageDigest message = MessageDigest.getInstance("SHA-256");

            //convert string to byte 
            byte[] encodehash = message.digest(datajwt.getBytes(StandardCharsets.UTF_8));

            //Convert the byte array to a hexadecimal
            StringBuilder hexString = new StringBuilder();
            for(byte data : encodehash){
                String hex = String.format("%02x", data);
                hexString.append(hex);
            }
            System.out.println(hexString.toString());
       }catch(NoSuchAlgorithmException e){
        e.printStackTrace();
       }
    }

    static void payloads() {

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy hh:mm:ss");
        String trx_date = format.format(date);
    
        Map payload = new HashMap<>();

        payload.put("client_id", "cgs_user");
        payload.put("trx_type", "BIN");
        payload.put("trx_date_time", trx_date);
        payload.put("System_trace_audit", "00000001");
        payload.put("pos_terminal_type","6017");
        payload.put("account_no","0000000018");

        String datapayload = JSONValue.toJSONString(payload);
      
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodepayload = digest.digest(datapayload.getBytes(StandardCharsets.UTF_8));

            StringBuilder buildpayload = new StringBuilder();
            for(byte resultpayload: encodepayload){
                String hash = String.format("%02x", resultpayload);
                buildpayload.append(hash);
            }
            System.out.println(buildpayload.toString());
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }

    }
    
}
