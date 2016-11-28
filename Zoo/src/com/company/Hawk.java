package com.company;

/**
 * Created by gilbertakpan on 11/22/16.
 */
public class Hawk extends Bird {
    public Hawk(){
        this.name = "Hawk";
    }
    @Override
    public void makeSound(){
        System.out.println("Caww!");
    }
}
