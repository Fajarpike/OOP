package ClassData;

import java.util.StringJoiner;

public class stringJoinerApp {

    public static void main(String[] args) {

        //String joiner sangat berguna untuk membuat data array sendiri / menggabung2 kan string
        StringJoiner stringjoiner = new StringJoiner("||", "{", "}");

       stringjoiner.add("Fajar");
       stringjoiner.add("Tita");
       stringjoiner.add("Rizki");
       stringjoiner.add("Nunung");

       System.out.println(stringjoiner);
    }
    
}
