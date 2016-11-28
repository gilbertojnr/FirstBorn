package com.company;

/**
 * Created by gilbertakpan on 11/22/16.
 */
public class Animal {
    String name;

    public void makeSound(){
        System.out.println("Animal sound");
    }

    @Override
    public String toString() {
        return this.name;
    }
}



