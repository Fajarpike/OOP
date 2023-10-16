class Manager extends Employee {
    
    String Company;
    Manager(String name) {
        super(name);
    }

    Manager(String name, String Company){
        super(name);
        this.Company = Company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + " my name is Manager " + this.name);
        
    }
}
