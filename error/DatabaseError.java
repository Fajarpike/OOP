package error;

import data.Data;

public class DatabaseError extends Error {
    
    public DatabaseError(String message) {
        super(message);
    }
}
