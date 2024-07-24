package com.riwi.MultimediaInhalte.utils.message;

public class ErrorMessages {
    
    public static String IdNotFound(String entity){
        final String message = "There are no records with entity %s with the supplied id";
        return String.format(message, entity);
    }
}
