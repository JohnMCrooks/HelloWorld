/*
 * Copyright (c) 2016.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by johncrooks on 6/29/16.
 */
public class Excercise08 {
    public static void main(String[] args) throws FileNotFoundException {
        // Parse people.csv into an arrayList of string that contains first and last names separated by a space
        //Using the scanner prompt the user for a search term
        //loop over ArrayList and print out the names that contain the search term.
        // Do it with a loop, but also find a way with Streams

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = parseFile();
        ArrayList<String> newNames = null;

        System.out.println("Who would you like to search for?");
        String searchVal = scanner.nextLine().toLowerCase();

        //Searched by stream below
        names.stream()
                .filter(name -> name.toLowerCase().contains(searchVal))
                .collect(Collectors.toCollection(ArrayList<String>::new))
                .forEach(System.out::println);


        //SOUT to seperate the two and make it more easily viewable
        System.out.println("| ");
        System.out.println("|--------------------------------- ");
        System.out.println("| ");
        //Sorted by for loop below
        for(String s : names){
            if (s.toLowerCase().contains(searchVal)){
                System.out.println(s);
            }
        }
    }

    public static ArrayList<String> parseFile() throws FileNotFoundException {
        File f = new File("people.csv");
        ArrayList<String> peopleArray = new ArrayList<>();
        Scanner scanner = new Scanner(f);
        while(scanner.hasNext()){
            String [] personString = scanner.nextLine().split(",");
            peopleArray.add(personString[1] + " " + personString[2]);
        }
        return peopleArray;
    }
}
