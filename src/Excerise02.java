/*
 * Copyright (c) 2016.
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by johncrooks on 5/26/16.
 */
public class Excerise02 {
    public static void main(String[] args) {
        Email e1 = new Email("Hi", "", "Alice@ironyard");
        Email e2 = new Email("Hello", "", "Charlie@ironyard");
        Email e3 = new Email("whatup", "", "bob@ironyard");
        Email e4 = new Email("YO", "", "Alice@ironyard");
        Email e5 = new Email("dig it", "", "bob@ironyard");

        Email[] emails = {e1, e2,e3, e4, e5};

        //hashmap organizing the emails by destination
        // "Alice @ironyard.com" --> [e1, e4]
        //"charlie@ironyard" --> [e2,e5]
        //
        HashMap<String, ArrayList<Email>> map = new HashMap<>();
        for(Email email: emails){
            ArrayList<Email> subArray = map.get(email.destination); //get subset of emails from individual adress
        if (subArray == null){          // if the array doesn't exist yet for a particular adress create it
            subArray = new ArrayList<>();
            subArray.add(email);
            map.put(email.destination, subArray);
        } else{
            subArray.add(email); // if it does exist, just add it to the Array.
        }
            //System.out.println(map);
            //System.out.println(map.toString());
        }

        // alternate way of populating Hashmap
        map = new HashMap<>();
        for (Email email: emails){
            if (!map.containsKey(email.destination)){
                map.put(email.destination, new ArrayList<>());
            }
            ArrayList<Email> subarray = map.get(email.destination);
            subarray.add(email);
        }
        System.out.println(map);




    }
}
