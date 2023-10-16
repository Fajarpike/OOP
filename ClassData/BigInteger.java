package ClassData;

public class BigInteger {

    public static void main(String[] args) {
        
        java.math.BigInteger bInteger = new java.math.BigInteger("100000000000000000000");
        java.math.BigInteger bigInteger2 = new java.math.BigInteger("100000000000000000000");

        java.math.BigInteger result = bInteger.add(bigInteger2);
        System.out.println(result);


    }
    
}
