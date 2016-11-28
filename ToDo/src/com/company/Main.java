package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<ToDoItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create to-do item");
            System.out.println("2. toggle to-do item");
            System.out.println("3. List to-do items");
            System.out.println("4. Remove item");
            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Enter your to-do item:");
                String text =scanner.nextLine();

                ToDoItem item = new ToDoItem(text, false);
                items.add(item);

            } else if (option.equals("2")) {
                System.out.println("Enter the number of the item you want to toggle:");
                int itemNum = Integer.parseInt(scanner.nextLine());

                ToDoItem item = items.get(itemNum-1);
                item.isDone =!item.isDone;

            } else if (option.equals("3")) {
                int i = 1;
                for (ToDoItem item : items) {
                    String checkbox = "[ ]";
                    if (item.isDone) {
                        checkbox = "[x]";
                    }
                    System.out.printf("%s %d. %s\n", checkbox, i, item.text);
//                    System.out.println(checkbox + i + ". " + item.text);
//                    i++;
                }
            }else if(option.equals("4")){
                System.out.println("Enter the number of the item you want to remove:");
                int itemNum = Integer.parseInt(scanner.nextLine());

                items.remove(itemNum-1);

            } else {
                System.out.println("Invalid Option");
            }
        }
    }
}
