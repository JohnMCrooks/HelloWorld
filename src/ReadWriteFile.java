/*
 * Copyright (c) 2016.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by johncrooks on 5/25/16.
 */
public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File f = new File("names.txt");

        FileWriter fw = new FileWriter(f);
        fw.write("Sample text to be written in File\n");  // This will OVERWRITE the file if it exists previously.
        fw.append("Bob\n");  // this appends the name into the file
        fw.append("Charlie\n");
        fw.close();


        // Read Line by Line
        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }


        System.out.println("\n--------------------------------\n"); // Spacer for visual clarity


        //Read Entire File At Once
        scanner = new Scanner(f);
        scanner.useDelimiter("\\z"); // Need to use two backslashes to escape the second slash
        System.out.println(scanner.next());
    }
}
