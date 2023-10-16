public class PersonAPP {
    
    public static void main(String[] args) {
    Person person1 = new Person("Fajar", "Subang");
    person1.sayHello("Aisyah");

    Person person2;
    person2 = new Person("Rizky");
    person2.address="Bogor";
    person2.sayHello("Nunung");

    Person person3;
    person3 = new Person();
    person3.name="Joko";
    person3.address = "Jakarta Barat";
    person3.sayHello("Ridho");

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);
    }
}
