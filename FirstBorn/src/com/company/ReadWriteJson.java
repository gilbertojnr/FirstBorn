package com.company;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by gilbertakpan on 11/23/16.
 */
public class ReadWriteJson {
    public static  void main(String[] args) throws IOException{
        Person p = new Person();
        p.setName("Alice Smith");
        p.setAge(30);

        File f = new File("person.json");

        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(p);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        JsonParser parse = new JsonParser();
        Person p2 = parse.parse(contents,Person.class);

        System.out.println(p2.getName() + " " + p2.getAge());
    }
}
