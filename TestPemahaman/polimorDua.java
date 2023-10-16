package TestPemahaman;

class polimorDua extends Polimorpisme {

    polimorDua(String name) {
        super(name);
    }

    void sayHi(String name) {
        System.out.println("Hi, " + name + " nama saya adalah " + this.name);
    }

    
}
