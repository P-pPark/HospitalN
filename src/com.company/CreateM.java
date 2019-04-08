package com.company;

import java.util.Scanner;

public class CreateM implements FactoryHospital {
    public Medicalstaff CreateMedicalstaff(String name, String qualification){
        Scanner in = new Scanner(System.in);
        System.out.print("Write name: ");
        name = in.nextLine();
        System.out.print("Write qualification: ");
        qualification = in.nextLine();

        return new Medicalstaff(name, qualification);}

    public void display() {
        System.out.println("medicalstaff");}

}
