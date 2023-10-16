class VicePresident extends Manager {
    
    VicePresident(String name) {
        super(name);
    }

    VicePresident() {
        super(null);
    }
    void sayHello(String name) {
        System.out.println("Hi " + name + " my name is vice president " + this.name);
    }
}
