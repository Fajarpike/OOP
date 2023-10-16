package ClassData;

import java.util.StringTokenizer;

public class stringTokenizerApp {

    public static void main(String[] args) {
        
        String name = "Fajar Pikekah, tita";
        //secara fungsi hampir mirip seperti split
        StringTokenizer tokenizer = new StringTokenizer(name, " ");

        while(tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
    
}
