import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

    public static void main(String[] args) {

        String reggex = "\\bcat\\b";
        String firstName ="\"Fajar\"";
        String lastName = " \"Pikekah\"";
        String fullName = firstName + lastName;
        String input = "\"I have a cat, but i like dogs more.\"";

        Pattern pattern = Pattern.compile(reggex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println("Match Found: " + matcher.group());
            System.out.println("Start index : " + matcher.start());
            System.out.println("End index : " + matcher.end());
        }

        String replaced = matcher.replaceAll("Lion");
        String replace = "[, ]";
        String output = input.replaceAll(replace,  " "); 
        System.out.println(output);

        System.out.println("Replace String " + replaced);
        String modif = "[\"\"]";
        String result = fullName.replaceAll(modif, "");
        System.out.println(result);

        //call method
        regularExpresion();
       
    }

    static void regularExpresion(){

        String regular = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String email = "test@example.com";

        Pattern pattern = Pattern.compile(regular);
        Matcher match = pattern.matcher(email);

        if(match.find()){
            System.out.println("valid email address");
        } else {
            System.out.println("invalid email address");
        }
    }
    
}
