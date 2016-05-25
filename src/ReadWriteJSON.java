/*
 * Copyright (c) 2016.
 */

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by johncrooks on 5/25/16.
 */
public class ReadWriteJSON {
    public static void main(String[] args) throws IOException {
        HashMap person = new HashMap();
        person.put("name", "alice");
        person.put("Age", 30);
        File f = new File("person.json");

        // Class Objects can be serialized as well as Hashmaps
        Person person2 = new Person();
        person2.name = "alice";
        person2.age = 35;


        //Write json   (serializing the hashmap - turning it into a string that can be written)
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(person2);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        //Reading Json
        Scanner scanner = new Scanner(f);
        scanner.useDelimiter("\\z");

        String contents = scanner.next();
        JsonParser parser = new JsonParser();
        //HashMap p3 = parser.parse(contents);  //--- to Parse into a HashMap
        Person p3 = parser.parse(contents, Person.class); //To Parse into a Class Object
        System.out.println(p3.toString());

    }
}
