package application;

import data.HelloWord;

public class HelloWordApp {

    public static void main(String[] args) {
        
        HelloWord english = new HelloWord() {
            
            public void sayHello(){
                System.out.println("ini adalah kalimat pertama");
            }

           public void sayHello(String sapa){
                System.out.println("ini adalah kalimat ke " + sapa);
            }
        };

        english.sayHello();
        english.sayHello("Fajar");
    }
    
}
