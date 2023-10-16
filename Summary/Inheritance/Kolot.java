package Summary.Inheritance;

class Kolot {

    String name;
    
    void Hello(String name){
        System.out.println("ini adalah kelas orang tua " + name);
    }
}

class Budak extends Kolot {
        String name;
        void Hello(String name){
            System.out.println("ini adalah kelas budak "+ name); 
        }   
}
