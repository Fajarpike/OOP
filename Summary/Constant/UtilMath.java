package Summary.Constant;

public class UtilMath {

    public static int Sum(int... value){

        int total = 0;
        for(int values : value){
            total += values;
        }
        return total;
    }
    
}
