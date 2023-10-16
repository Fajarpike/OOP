package data;

import javax.xml.transform.Source;

public class ProductApp {

    public static void main(String[] args) {
        Product product;
        product = new Product("Lenovo", 4300000);
        System.out.println(product.name + " " + product.price);

        System.out.println(product);

        Product product3 = new Product("Lenovo", 4300000);
        System.out.println(product.equals(product3));
        System.out.println(product.hashCode() == product3.hashCode());
    }
    
}
