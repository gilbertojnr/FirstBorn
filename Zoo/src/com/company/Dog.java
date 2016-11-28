package com.company;

/**
 * Created by gilbertakpan on 11/22/16.
 */
public class Dog extends Mammal {
    public Dog() {
        this.name = "Dog";
    }
    @Override
    public void makeSound(){
        System.out.println("Bark!");
    }
}
