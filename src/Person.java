/*
 * Copyright (c) 2016.
 */

/**
 * Created by johncrooks on 5/16/16.
 */
public class Person {
    static final int familySize = 10;
    String name;
    int age;
    boolean isAlive;
    Person[] family = new Person[familySize];

    public Person(String name, int age, boolean isAlive){
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public Person() {
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        if (isValidName(newName)){
            this.name = newName;
    }}
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean getIsAlive(){
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public static boolean isValidName(String newName){
        return newName.contains(" ");
    }

}
