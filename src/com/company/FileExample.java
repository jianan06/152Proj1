package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileExample {
    static Scanner reader = new Scanner(System.in);
    public static void main (String[] args)throws IOException{
        //part 1 reading into the list
        System.out.println("Whats the students name?");
        var file = reader.nextLine();
        var fileName = file+".txt";
        String all_names = Files.readString(Paths.get(fileName));
        String[] grade_list = all_names.split("\n");
        //part2 - printing the list
        var num = 0;
        for (String name: grade_list){ //note the
            num = num + Integer.parseInt(name);
        }
        System.out.println("Their average is "+num/grade_list.length+".");
    }
}
