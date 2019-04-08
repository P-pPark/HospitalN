package com.company;

import java.util.Scanner;

class Patient extends Person{

    private int num; // номер палаты
    private String diagnosis // диагноз
            ;

    public Patient(String name, String diagnosis, int num) {

        super(name);
        Scanner in = new Scanner(System.in);
        System.out.print("Write diagnosis: ");
        diagnosis = in.nextLine();
        System.out.print("Write num: ");
        num = in.nextInt();
        this. diagnosis = diagnosis;
        this.num=num;
    }

    public String display(){
        System.out.printf(" %s\n is a patient with %s \n", name, diagnosis);
        System.out.printf("He stay in room № %s\n", num);
        System.out.println();
        return null;
//
    }

    //public String getDiagnosis (){ return diagnosis; }
    // public int getNum(){ return num; }
}
