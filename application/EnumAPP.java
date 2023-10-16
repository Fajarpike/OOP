package application;

import data.Level;
import data.Customer;

import data.Customer;

public class EnumAPP {

    public static void main(String[] args) {
        
        Customer customer = new Customer();
        customer.setName("Fajar");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        //konversi dari enum ke string
        String levelString = Level.STANDAR.name();
        System.out.println(levelString);

        //konversi dari string ke enum
        Level level = Level.valueOf("VIP");
        System.out.println(level);
       
    }
    
}
