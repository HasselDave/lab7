package com.company;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
    }
    public static Singleton getInstance(){
        if(instance==null) {
            Singleton instance= new Singleton();

        }
        return instance;
    }
}
