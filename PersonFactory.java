package com.company;

public class PersonFactory {

    public  static Person createPerson(People personType) {
        switch (personType) {
            case DOCTOR:
                return new Doctor("Paul", "Terap");
            case PATIENT:
                return new Patient("Rut", "dkvhdbc", 13);
            case MEDICALSTAFF:
                return new Medicalstaff("War", "svnfc");
            default:
                System.out.println("Invalid selection. Try once more");
                break;
        }
        return null;
    }
}


