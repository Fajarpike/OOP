class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    void sayHello(String paramName) {
        System.out.println("Hi " + paramName + ", i'm employee My name is  " + this.name);
    }
    
}
