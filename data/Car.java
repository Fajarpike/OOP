package data;

public interface Car extends Hashbran {
    
    void drive();

    int getTire();

    default boolean isBig(){
        return false;
    }

    boolean isMaintance();

    
}
