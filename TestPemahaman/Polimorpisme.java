package TestPemahaman;

class Polimorpisme {
    
    String name;
    int age;

    Polimorpisme(String firstName, int currentAge ) {

        this.name = firstName;
        this.age = currentAge;
    }

    Polimorpisme(String firstName){
        this.name = firstName;
    }

    void sayHi(String name) {
        System.out.println("Hi, " + name + " nama saya " + this.name);
    }
    
}
