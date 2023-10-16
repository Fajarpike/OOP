class managerApps {
    
    public static void main(String[] args) {

        Manager manager = new Manager("Fajar");
        manager.sayHello("Aisyah");

        VicePresident vicePresident;
        vicePresident = new VicePresident();
        vicePresident.name = "Ucok";
        vicePresident.sayHello("Diki");
    }
}
