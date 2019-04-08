package com.company;

import java.util.Scanner;

public class CreateD implements FactoryHospital {
    public Doctor CreateDoctor(String name, String department) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write name: ");
        name = in.nextLine();
        System.out.print("Write department: ");
        department = in.nextLine();
        return new Doctor(name, department);
    }
    public void display() {
        System.out.println("doctor");
    }
}
