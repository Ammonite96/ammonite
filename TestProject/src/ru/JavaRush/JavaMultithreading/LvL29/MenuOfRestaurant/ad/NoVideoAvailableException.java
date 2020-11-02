package ru.JavaRush.JavaMultithreading.LvL29.MenuOfRestaurant.ad;

public class NoVideoAvailableException extends RuntimeException {

    public NoVideoAvailableException() {
    }

    public NoVideoAvailableException (String message){
        super(message);
    }
}
