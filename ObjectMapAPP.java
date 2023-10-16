import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONValue;

// import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapAPP {

    public static void main(String[] args)
    {

    //  Map address = new HashMap<>();
    //  address.put("rt", "01");
    //  address.put("rw", "01");

     Map<String, String> Mymap = new HashMap<>();
     Mymap.put("Nama", "Fajar");
     Mymap.put("Nik", "089797780002");
     Mymap.put("alamat", "Cinangsi");

    //  String json = JSONValue.toJSONString(map);
    //  System.out.println(json);
    Map<String, String> uppercaseMap = new HashMap<>();

    //iterate through the original HashMap and convert values to Uppercase
    for(Map.Entry<String, String> entry : Mymap.entrySet()){
        String Key = entry.getKey();
        String Value = entry.getValue().toUpperCase();
        uppercaseMap.put(Key, Value);
    }
        System.out.println(uppercaseMap);     
    }
}
