package application;

import error.DatabaseError;

public class DatabaseApp {

    public static void main(String[] args) {
    
        connectorDatabase(null, "rahasia");
        System.out.println("sukses");

    }

    public static void connectorDatabase(String username, String password) {

        if(username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
    
}
