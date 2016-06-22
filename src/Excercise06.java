/*
 * Copyright (c) 2016.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by johncrooks on 6/22/16.
 */
public class Excercise06 {
    public static void main(String[] args) {
        // Goal of the excercise is to take a number
        int num = 73749326;
        // return it in reverse aka: 54321
        //Personal Technique below, not finished......
        String var = Integer.toString(num);
        char[] var1 = var.toCharArray();
        char[] var2 = var1.clone();
        int x = 0;
        int y = var1.length-1;
        while (x<=var1.length && y>=0){
           var2[x] = var1[y];
            x++;
            y--;
        }
        String results=  String.valueOf(var2);
        System.out.println(results);
//        solveViaMath(num);
    }

    public static void viaLoop(int num) {


        char[] chars = String.valueOf(num).toCharArray();
        char[] reverse = new char[chars.length];

        int n= chars.length-1;
        for (char c:chars){
            reverse[n] = c;
            n--;
        }

        int reverseNum = Integer.valueOf(String.valueOf(reverse));
        System.out.println(reverse);

    }

    public static void solveviaStringBuilder (int num){

        StringBuilder sb = new StringBuilder(String.valueOf(num));
        int reverseNum = Integer.valueOf(sb.reverse().toString());
        System.out.println(reverseNum);

    }

    public static void solveViaMath(int num){
        int reverse = 0;
        System.out.println(reverse + "----" + num);
        while(num !=0){
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num /10;
            System.out.println(reverse + "----" + num);
        }
    }

}
