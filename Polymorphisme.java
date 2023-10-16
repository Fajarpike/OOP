public class Polymorphisme {

    public static void main(String[] args) {
        
        Employee employee = new Employee("Fajar");
        employee.sayHello("Budi");

        employee = new Manager("Aisyah");
        employee.sayHello("dino");

        employee = new VicePresident("Rizal");
        employee.sayHello("Diki");

        sayHello(new Employee("Reza"));
        sayHello(new Manager("Ifan"));
        sayHello(new VicePresident("Dalung"));
    }

    static void sayHello(Employee employee) {

        //Melakukan pengecekan tipe data dan konversi 
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee; //konversi
            System.out.println("Hello Vice President " + vicePresident.name);
        }else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else {
            System.out.println("Hello " + employee.name);
        }
       
    }

    
}
