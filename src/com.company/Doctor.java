package com.company;

import java.util.Scanner;

class Doctor extends Person {

    private String department;

    public Doctor (String name, String department) {

        super(name);
        Scanner in = new Scanner(System.in);
        System.out.print("Write department: ");
        department = in.nextLine();
        this. department = department;
    }
    public String getDepartment (){
        return department; }
    public String display(){
        System.out.printf(" %s is a doctor of %s \n", name, department);
        System.out.println();
        return null;
//
    }

}
