package Summary.Constant;

public class ConstantAPP {

    public static void main(String[] args) {
        
        System.out.println(Konstan.APPLICATION);
        System.out.println(Konstan.VERSION);

        System.out.println(UtilMath.Sum(1,2,3,4,5,6,7,8,8));

        Desa desa = new Desa();
        desa.setName("Saguling");
        System.out.println("Nama Desa : " + desa.getName());

        Desa.RT rt = new Desa.RT();
        rt.setName("RT 18");
        System.out.println("RT : " + rt.getName());

        System.out.println(Aplikasi.PROCCESOR);

    }
    
}
