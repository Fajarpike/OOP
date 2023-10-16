package Summary.Enum;

import data.Level;

public class EnumAPPS {

    public static void main(String[] args) {
        
        Rino rino = new Rino();
        rino.setName("rino");
        rino.setJenisKelamin(JenisKelamin.MALE);

        System.out.println(rino.getName());
        System.out.println(rino.jenisKelamin().getDescription());

    }
    
}
