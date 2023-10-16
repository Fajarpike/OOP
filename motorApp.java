import java.math.BigInteger;
public class motorApp {

    public static void main(String[] args)
    {
        motor Mtr = new motor("scoopy", "metic");
        Mtr.maju("50");
        
        motoVixion Mtrmanual = new motoVixion("vixion", " 250 CC", 56000000);
        Mtrmanual.belok("kiri kanan");
    }
    
}
