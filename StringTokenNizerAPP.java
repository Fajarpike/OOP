import java.util.StringTokenizer;

public class StringTokenNizerAPP {

    public static void main(String[] args) {
        
        String name = "Fajar Pikekah Wijaya";

        StringTokenizer tokenizer = new StringTokenizer(name, " ");

        while(tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
    
}
