package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
        
       
        //cara automatis menutup file menggunakan try with resource
        try( BufferedReader reader = new BufferedReader(new FileReader("Readme.md"))){
            while(true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
        }catch(Throwable throwable){
            System.out.println("Error membaca file" +throwable.getMessage());
        // } finally{ //ini adalah cara manual untuk menutup file
        //     if(reader != null){
        //         try{
        //             reader.close();
        //             System.out.println("Sukses menutup");
        //         }catch(IOException ioException){
        //             System.out.println("Error menutup resource" + ioException.getMessage());
        //         }
        //     }
        }
        
    }
}
