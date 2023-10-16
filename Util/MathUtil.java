package Util;

public class MathUtil {
    
    public static int sun(int... values) {

        int total = 0;
        for(int value : values){
            total += value;
        }
        return total;
    }
}
