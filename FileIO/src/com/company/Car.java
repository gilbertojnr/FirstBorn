package com.company;

import java.util.Scanner;

import java.io.FileNotFoundException;
import java.io.File;

import jodd.json.JsonSerializer;
import jodd.json.JsonParser;

import java.io.FileWriter;
import java.io.IOException;


/**
 * Created by gilbertakpan on 11/23/16.
 */
public class Car {
    String make;
    String model;
    int year;
    String engineSize;
    String color;


    public void enterMake() {
//        System.out.println("What is the make?");
        make = Main.scanner.nextLine();
        System.out.println("Thank you");

    }

    public void enterModel() {
//        System.out.println("What is the model?");
        model = Main.scanner.nextLine();
        System.out.printf("model: %s\n", model);
    }

    public void enterYear() {
//        System.out.println("Enter the year of your car");
        year = Integer.parseInt(Main.scanner.nextLine());
        System.out.println(" Thank you");
    }

    public void enterEngineSize() {
//        System.out.println("Enter engine size");
        engineSize = Main.scanner.nextLine();
        System.out.printf("Engine Size: %s\n", engineSize);

    }

    public void enterColor() {
//        System.out.println("enter your car color");
        color = Main.scanner.nextLine();
        System.out.printf("Color: %s\n", color);
    }


    public static void saveInfo(Car car) throws IOException {
        JsonSerializer s = new JsonSerializer();
        String json = s.include("*").serialize(car);
        File f = new File("car.json");
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
    }


    public static Car loadInfo() throws FileNotFoundException {
        File f = new File("car.json");
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();


        JsonParser p = new JsonParser();
        return p.parse(contents, Car.class);
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
