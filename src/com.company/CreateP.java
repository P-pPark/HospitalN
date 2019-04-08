package com.company;

import java.util.Scanner;

public class CreateP implements FactoryHospital {
    public Patient CreatePatient(String name, String diagnosis, int num){
        Scanner in = new Scanner(System.in);
        System.out.print("Write name: ");
        name = in.nextLine();
        System.out.print("Write diagnosis: ");
        diagnosis = in.nextLine();
        System.out.print("Write num: ");
        num = in.nextInt();
        return new Patient(name, diagnosis, num);}
    public void display() {
        System.out.println("patient");}

}