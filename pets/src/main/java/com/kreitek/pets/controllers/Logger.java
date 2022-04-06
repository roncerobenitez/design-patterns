package com.kreitek.pets.controllers;

import com.kreitek.pets.domain.Dog;
import com.kreitek.pets.infraestructure.bd.DbService;

public class Logger {

    private static volatile Logger instance = null;

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
    public void debug ( String contador){

        //int contador = Integer.parseInt((ExecutePut)+1);

        int invremento = Integer.parseInt(contador)+1;

        System.out.println( "[debug]"  +  invremento + contador );
        //"[degug][contador]  - " al parámetro de entrada, como en los siguientes ejemplos:

    }

}