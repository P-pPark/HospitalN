package com.company;

import java.util.Scanner;

public class Person {
    public String name;

    public Person(String name){
        Scanner in = new Scanner(System.in);
        System.out.print("Write name: ");
        name = in.nextLine();
        this.name=name;
    }
    public String getName() {
        return name; }
    public String display(){
        System.out.printf("Person %s ", name);

        return null;
    }
    //@Override
    // public String toString(){
    //      return "Person " + name;
    // }

}
