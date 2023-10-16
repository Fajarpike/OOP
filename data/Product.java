package data;

public class Product {
    
    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;

    }

    public String toString(){
        return ("Product name: " + name + " price " + price);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
       int result = name != null ? name.hashCode() : 0;
       result = 31 * result + price;
       return result;
    }

    public boolean equals(Object o){

        if(o == this) {
            return true;
        }

        if(!(o instanceof Product)){
            return false;
        }

        Product product = (Product) o;
        if(this.price != product.price){
            return false;
        }
        if(this.name != null){
            return this.name.equals(product.name);
        }else{
            return product.name == null;
        }
    }
}
