package com.kreitek.pets.controllers;

public class Logger {

    private static volatile Logger instance = null;
    private int contador=0;

    private Logger() {
        if (instance != null) {
            throw new RuntimeException("Usage getInstance() method to create");
        }
    }
    public static Logger getInstance() {
        if (instance == null) {
            synchronized(Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    public void debug(String texto){


       contador++;

       System.out.println( "[debug]"  + "[" + contador + "] - " + texto );


    }


}