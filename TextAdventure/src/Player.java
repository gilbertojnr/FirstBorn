import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by gilbertakpan on 11/16/16.
 */
public class Player extends Character{
//    private String name;
     private String weapon;
     private String location;
//    int health;
//    int damage;
    private ArrayList<String> items = new ArrayList();

    public Player(){
        this.health = 20;
        this.damage = 20;

    }

    public void findItem(String item) {
        System.out.printf("You found a %s! Pick it up? [y/n]\n",item);
//        System.out.println("You found a " + item + "! Pick it up? [y/n]");
        String answer = Game.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.println("You picked up an item!");
        } else {
            System.out.printf("Are you sure you want to discard %s? [y/n]\n", item);
//            System.out.println("Are you sure you want to discard " + item + "? [y/n]");
            answer = Game.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                items.add(item);
                System.out.println("you picked up an item!");
            }
        }
    }


    public void chooseName() {
        System.out.println("What is your name?");
        name = Game.nextLine();
        System.out.printf("Welcome, %s\n", name);
//        System.out.println("Welcome, " + name);

    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose your weapon [sword/mace]");
        weapon = Game.nextLine();

        if (weapon.equalsIgnoreCase("sword")) {
            System.out.println("A sword is a fine choice!");
        } else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("A mace is a fine choice!");
        } else {
            throw new Exception("Invalid Weapon!");
        }
    }

    public void chooseLocation() throws Exception {

        System.out.println("Choose your location [forest/tunnel]");
        location = Game.nextLine();

        if (location.equalsIgnoreCase("forest")) {
            System.out.println("Entering forest...");

        } else if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");

        } else {
            throw new Exception("Invalid location:" + location);
        }
    }

    public static void saveGame(Player player) throws IOException{
        JsonSerializer s = new JsonSerializer();
//        the * tells json to run everything including the lists.
        String json = s.include("*").serialize(player);
//        File f creates a file for string json
        File f = new File("game.json");
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();


    }

    public static Player loadGame() throws FileNotFoundException{
        File f = new File("game.json");
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();

//        parsing turns it to a player object to be able to return Player

        JsonParser p = new JsonParser();
        return p.parse(contents, Player.class);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
}
