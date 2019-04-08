package com.company;

import java.util.Scanner;

class Medicalstaff extends Person {
    private String qualification;

    public Medicalstaff (String name, String qualification) {

        super(name);
        Scanner in = new Scanner(System.in);
        System.out.print("Write qualification: ");
        qualification = in.nextLine();
        this.qualification = qualification;
    }
    public String getQualification (){ return qualification; }

}
