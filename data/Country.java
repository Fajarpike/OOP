package data;

public class Country {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Hanya inner class yang bisa dibuat static
    public static class City {

        private String name;

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name; 
        }
    }
    
}
