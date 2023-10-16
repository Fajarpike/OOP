import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONValue;

public class setDateTime {

    public static void main(String[] args)
    {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss");
        String tgl_trx = format.format(date);

        Map data = new HashMap<>();

        data.put("Nama", "Fajar");
        data.put("alamat", "Cinansi");
        data.put("nominal", new Integer(3000));
        data.put("tanggal_transaksi", tgl_trx);

        String jsonData = JSONValue.toJSONString(data);   
        System.out.println(jsonData);

        String encodingData = Base64.getEncoder().encodeToString(jsonData.getBytes());
        System.out.println(encodingData);

        byte[] decodeData = Base64.getDecoder().decode(encodingData);

        String datadecode = new String(decodeData);
        System.out.println(datadecode);
    }
}