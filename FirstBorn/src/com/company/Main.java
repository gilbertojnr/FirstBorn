package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        names[3] = "Kyle";

        Scanner scanner = new Scanner(System.in);
        boolean correctName = true;

        while(!correctName){
            System.out.println("Enter name");
            String name = scanner.nextLine();
            if(!name.equalsIgnoreCase("Kyle")){
                correctName = true;
            }
        }

        do {
            System.out.println("Enter name again");
            String name = scanner.nextLine();
            if(!name.equalsIgnoreCase("Kyle")){
                correctName = false;
            } else {
                correctName = true;
            }
        } while(!correctName);


        String scoreString = "1";
        int score = Integer.parseInt(scoreString);
        Integer level = 1;


        ArrayList<String> moreNames = new ArrayList();
        moreNames.add("Kyle");
        moreNames.add("John");
        moreNames.add("Josh");

        moreNames.remove(0);

        System.out.println(moreNames.get(0));

        HashMap<String, String> person = new HashMap();
        person.put("name", "Alice");
        person.put("address", "17 Princess St");

        person.remove("name");
//
        System.out.println(person.get("name"));

        }



//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//
//        for (String name : names) {
//            System.out.println(name);
//
        }




