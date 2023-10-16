package data;

public enum Level {
    
    STANDAR("Standar Level"),
    PREMIUM("Premium Level"),
    VIP("Vip Level  ");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
