/*
 * Copyright (c) 2016.
 */

import java.util.ArrayList;

/**
 * Created by johncrooks on 6/9/16.
 */
public class Excercise05 {
    public static void main(String[] args) {

        String[] names = {"Charlie", "David", "Alice", "Bob", "Albert"};

        //want an array list of sorted strings using an algorithm
        //ArrayLIst<String> sortedNames
        int i = 0;
        int x = 0;
        String temp = "";
        ArrayList<String> sortedNames = new ArrayList<>();

        //Sorting algorithm
        for (String name:names) {
            int index = 0;
            for (String sortedName:sortedNames){
                if (name.compareTo(sortedName)>0){
                    index++;
                }else{
                    break;
                }
            }

            sortedNames.add(index, name);
            System.out.println(sortedNames);
        }


//        for (i = 0; i < names.length;i++){
//            for (x=0;x<names.length;x++){
//                if(names[x].compareTo(names[x+1]) <0){
//                    temp = names[x];
//                    names[x] = names[x+1];
//                    names[x+1] = temp;
//                    x++;
//                }else{
//                    x++;
//                }
//                i++;
//            }
//        }
//        System.out.println(names.toString());
//
    }
}
