import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Base64;

public class urlEncode {

    public static void main (String[] args)
    {
        //encode URL
        String Url = "http://apidev.banglego.com/indhome/va/v1.0/inquiry";
        String UrlEncoder = null;

        try{
            UrlEncoder = URLEncoder.encode(Url, "UTF-8");
            System.out.println("Encode URL : " + UrlEncoder);
            String encode = Base64.getEncoder().encodeToString(UrlEncoder.getBytes());
            System.out.println("Encode URL : " + encode);
        } catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
    
}
