package Summary.Enum;

public enum JenisKelamin {

    MALE("Laki - Laki"),
    FEMALE("Perempuan");

    private String description;

    JenisKelamin(String deskripsi){
        this.description = deskripsi;
    }

    public String getDescription(){
        return description;
    }
    
}
