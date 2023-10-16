public class ParentApps {

    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Paku";
        child.doIt();
        System.out.println(child.name);
 
        //jika ingin menggunakan method child gunakan konversi
       Parent parent = (Parent) child;
       parent.doIt();
       System.out.println(parent.name);
    }
    
}
