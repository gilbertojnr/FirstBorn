package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by gilbertakpan on 11/23/16.
 */
public class ReadWriteFile {
    public static void main(String args []) throws IOException{
        File f = new File("names.txt");
        FileWriter fw = new FileWriter(f);
//        write rewrites everything in the file
        fw.write("Alice\n");
//        append attaches items to existing file
        fw.append("Bob\n");
        fw.append("Charlie\n");

        fw.close();

        Scanner scanner = new Scanner(f);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

        scanner = new Scanner(f);
        scanner.useDelimiter("\\Z");
        String contents = scanner.next();
        System.out.println(contents);

    }
}

