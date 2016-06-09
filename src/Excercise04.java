/*
 * Copyright (c) 2016.
 */

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by johncrooks on 6/8/16.
 */
public class Excercise04 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Jones", "Charlie", "Brown"};
        HashMap<String, String> namesMap = new HashMap<>();

        // want to end with something like this {Smith:Alice, Jones:Bob, Brown:Charlie}
        //HashMap<String,String>

        //solution 1: Traditional For Loop
        for (int i = 0; i < names.length; i += 2) {
            String firstname = names[i];
            String lastName = names[i + 1];
            namesMap.put(lastName, firstname);
            System.out.println(namesMap);

        }

        //Solution 2: returns a generic list object
        namesMap = new HashMap<>();
        ArrayList<String> namesarr = new ArrayList<>(Arrays.asList(names));
        ArrayList<String> pair;
        while (namesarr.size() > 0) {
            pair = new ArrayList<>(namesarr.subList(0, 1));
            namesMap.put(pair.get(1),pair.get(2));
            namesarr = new ArrayList<>( namesarr.subList(2,namesarr.size()));
        }
        System.out.println(namesMap);
    }
}