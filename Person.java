class Person {
  
    String name;
    String address;
    final String country = "Indonesia";


    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String paramName) {
        //kata kunci this() digunakan untuk memanggil constructor yang lain
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is " + this.name);
        System.out.println("Saya tinggal di " + address);
    }
}
