
public class StringJoiner {

    public static void main(String[] args) {
        
        java.util.StringJoiner joiner = new java.util.StringJoiner(",", "[", "]");

        joiner.add("Fajar");
        joiner.add("Pikekah");

        String data = joiner.toString();
        System.out.println(data);

    }
    
}
