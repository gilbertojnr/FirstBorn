package com.company;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Car car = new Car();


    public static void main(String[] args) throws IOException {
        System.out.println("Welcome! tell us more about your new car");

        try {
            car = Car.loadInfo();
            System.out.println("Saved Information loaded");

        } catch (Exception e) {
            System.out.println("Tell us more about your car");
        }
        if (car.getMake() == null) {
            car.enterMake();
        }
        if (car.getModel() == null) {
            car.enterModel();
        }
        if (car.getYear() == 0) {
            car.enterYear();

        }
        if (car.getEngineSize() == null) {
            car.enterEngineSize();
        }
        if (car.getColor() == null) {
            car.enterColor();
        }
        {
            Car.saveInfo(car);
//            System.out.println("Saved Info!");
            System.out.println("Make: " + car.make);
            System.out.println("Model: " + car.model);
            System.out.println("Year: " + car.year);
            System.out.println("Engine Size: " + car.engineSize);
            System.out.println("Color: " + car.color);
            System.out.println("Would you like to make any changes? [y/n]");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("choose one [make/model/year/Engine size/color]");
                String change = scanner.nextLine();

                if (change.equalsIgnoreCase("make")) {
                    System.out.println("Enter New Make");
                    car.enterMake();
                }
                if (change.equalsIgnoreCase("model")) {
                    System.out.println("Enter Model");
                    car.enterModel();
                }
                if (change.equalsIgnoreCase("year")) {
                    System.out.println("Enter Model Year");
                    car.enterYear();
                }
                if (change.equalsIgnoreCase("Engine size")) {
                    System.out.println("Enter Engine Size");
                    car.enterEngineSize();
                }
                if (change.equalsIgnoreCase("Color")) {
                    System.out.println("Enter Color");
                    car.enterColor();
                }

                car.saveInfo(car);
            }


            car.enterMake();
            car.enterModel();
            car.enterYear();
            car.enterEngineSize();
            car.enterColor();
            // write your code here
        }
    }
}
