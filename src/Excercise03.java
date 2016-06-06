/*
 * Copyright (c) 2016.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by johncrooks on 6/6/16.
 */
public class Excercise03 {
    public static void main(String[] args) {
        String[] names = {"alice","bob","charlie","andrew","edward"};
        //Goals
        //Step 1: want to end up with an ArrayList of Strings that contains the names with only capital letters
        //Step 2: Remove names that don't start with -A-
        //["ALICE", "ANDREW"]

        //Step 1 - Capitalize Names
        ArrayList<String> nameArray = new ArrayList<String>();
        for (String name:names) {
            nameArray.add(name.toUpperCase());
        }

       //Step 2 - Check for first letter and remove if not an A

      /*  //This solution will cause a Concurrent Exception - Don't do this.
        for (String name:nameArray)
             { if (!name.startsWith("A")){
                nameArray.remove(name);
                }
        }
        */

        //Working Solution 1 - Modify index after removing object
        for (int i = 0; i<nameArray.size(); i++){
            String name = nameArray.get(i);
            if (!name.startsWith("A")){
                nameArray.remove(i);
                i--;
            }
        }
        System.out.println(nameArray.toString());

        //Working Solution 2 - Using a temporary Array to store correct Values
        nameArray = new ArrayList<String>();
        for (String name:names) {
            nameArray.add(name.toUpperCase());
        }
        ArrayList<String> tempNames = new ArrayList<String>();
        for (String name: nameArray){
            if (name.startsWith("A")){
                tempNames.add(name);
            }
        }
        System.out.println(tempNames);

        //Working solution 3 - Using an iterator --> doesn't use an index so allows modification while looping through.
        nameArray = new ArrayList<String>();
        for (String name:names) {
            nameArray.add(name.toUpperCase());
        }
        Iterator<String> iter = nameArray.iterator();
        while  (iter.hasNext()){
            String name = iter.next();
            if (!name.startsWith("A")){
                iter.remove();
            }
        }
        System.out.println(nameArray);

        //Working Solution 4: use a stream (Lambdas)
        nameArray = new ArrayList<String>();
        for (String name: names){
            nameArray.add(name);
        }
        nameArray = nameArray.parallelStream()
                .map((name)-> {
                    return name.toUpperCase();
                })
                .filter((name)-> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(nameArray);

}}

