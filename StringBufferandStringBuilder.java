

public class StringBufferandStringBuilder { 
    
    public static void main(String[] args) {
        
        //stringBuffer thread safe //sedangkan stringBuilder tidak thread safe

      StringBuilder builders = new StringBuilder();

      builders.append("Fajar");
      builders.append(" ");
      builders.append("Pikekah");
    
        String result = builders.toString();
        System.out.println(result);
   }
}
