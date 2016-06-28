/*
 * Copyright (c) 2016.
 */

/**
 * Created by johncrooks on 6/28/16.
 */





public class Excercise07 {
    public static void main(String[] args) {
        String s = "racecar";
        String b  = "abca";
        String c = "dad";
        Boolean isTrue =  isPalindrome(s);
        System.out.println(isTrue.toString());
        System.out.println(isPalindrome2(s));
    }



    public static boolean isPalindrome(String input){
        int x = input.length()-1;
        int y = 0;
        while (x>0){
            if(input.toCharArray()[x]!=input.toCharArray()[y]){
                return false;
            } else{
                x--;
                y++;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String input){
        StringBuilder sb = new StringBuilder(input);
        return (input.equals(sb.reverse().toString()));

    }

}
