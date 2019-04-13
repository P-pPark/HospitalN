package com.company;

import java.util.Scanner;

public class Menu {
    public void display1(){
        System.out.println("=============================");
        System.out.println("|      MENU SELECTION 1     |");
        System.out.println("=============================");
        System.out.println("| Options:                  |");
        System.out.println("|        1. add Person      |");
        System.out.println("|        2. remove Person   |");
        System.out.println("|        3. show Person     |");
        System.out.println("|        4. correct Person  |");
        System.out.println("|        5. save changes    |");
        System.out.println("|        6. Exit            |");
        System.out.println("=============================");
        System.out.println(" Select option: ");
    }

    public void display2(){
        System.out.println("=============================");
        System.out.println("|      MENU SELECTION 2     |");
        System.out.println("=============================");
        System.out.println("| Options:                  |");
        System.out.println("|     1. add Doctor         |");
        System.out.println("|     2. add Patien         |");
        System.out.println("|     3. add Medicalstaff   |");
        System.out.println("|     4. Exit               |");
        System.out.println("=============================");
        System.out.println(" Select option: ");
    }

    public void display3(){
        System.out.println("==============================|");
        System.out.println("|       MENU SELECTION 3      |");
        System.out.println("==============================|");
        System.out.println("| Options:                    |");
        System.out.println("|     1. remove Doctor        |");
        System.out.println("|     2. remove Patien        |");
        System.out.println("|     3. remove Medicalstaff  |");
        System.out.println("|     4. Exit                 |");
        System.out.println("===============================");
        System.out.println(" Select option: ");

    }

    public void display4() {
        System.out.println("==============================|");
        System.out.println("|       MENU SELECTION 4      |");
        System.out.println("==============================|");
        System.out.println("| Options:                    |");
        System.out.println("|     1. show Doctor          |");
        System.out.println("|     2. show Patien          |");
        System.out.println("|     3. show Medicalstaff    |");
        System.out.println("|     4. Exit                 |");
        System.out.println("===============================");
        System.out.println(" Select option: ");
    }
    public void display5(){
        System.out.println("==============================|");
        System.out.println("|       MENU SELECTION 5      |");
        System.out.println("==============================|");
        System.out.println("| Options:                    |");
        System.out.println("|     1. correct Doctor        |");
        System.out.println("|     2. correct Patien        |");
        System.out.println("|     3. correct Medicalstaff  |");
        System.out.println("|     4. Exit                 |");
        System.out.println("===============================");
        System.out.println(" Select option: ");

    }
    Container <Doctor> Doctors = new ArrayContainer <>();
    Container <Patient> Patients = new ArrayContainer<>();
    Container <Medicalstaff>  Medicalstaffs = new ArrayContainer<>();

    public int enterNumber(){
        int swValue;
        Scanner scan = new Scanner(System.in);
        swValue =  scan.nextInt();
        System.out.println ("You entered a number " + swValue);
        return swValue;
    }

    public void option() {
        boolean notExit = true;
        while (notExit) {
            switch (enterNumber()) {
                case 1:
// Display Menu 2
                    display2();
                    addPerson();
                    break;
                case 2:
                    display3();
                    removePerson();;
                    break;
                case 3:
                    display4();
                    showPerson();;
                    break;
                case 4:
                    display5();
                    correctPerson();;
                    break;
                case 5:
                    saveChanges();;
                    break;
                case 6:
                    notExit = false;
                    System.out.println("Exit menu sellection 1");
                    break;
                default:
                    System.out.println("Invalid selection. Try once more");  break;

            }
        }

    }

    public void addPerson() {
        boolean not1Exit = true;
        FactoryDPM factory = new FactoryDPM();
        while(not1Exit) {

            switch(enterNumber()) {
                case 1:
                    Doctor D1 = factory.createDoctor("","");
                    Doctors.add(D1);
                    System.out.println ("You entered a doctor ");
                    break;
                case 2:
                    Patient P1 = factory.createPatient("","", 0);
                    Patients.add(P1);
                    System.out.println ("You entered a patient ");break;
                case 3:
                    Medicalstaff M1 = factory.createMedicalstaff("","");
                    Medicalstaffs.add(M1);
                    System.out.println ("You entered a medicalstaff ");break;
                case 4: not1Exit = false;
                    display1();

                    option();
                    System.out.println("Exit menu sellection 2"); break;
                default:
                    System.out.println("Invalid selection. Try once more"); break;
            }
        }
    }

    public void removePerson() {
        boolean not1Exit = true;
        while(not1Exit) {
            switch(enterNumber()) {
                case 1: System.out.println ("You delete a doctor ");
                    break;
                case 2: System.out.println ("You delete a patient ");break;
                case 3: System.out.println ("You delete a medicalstaff ");break;
                case 4: not1Exit = false;
                    display1();
                    option(); break;
                default:
                    System.out.println("Invalid selection. Try once more"); break;
            }
        }
    }

    public void showPerson() {
        boolean not1Exit = true;
        while(not1Exit) {
            switch(enterNumber()) {
                case 1: System.out.println (Doctors.printAll());
                    break;
                case 2: System.out.println (Patients.printAll());;break;
                case 3: System.out.println (Medicalstaffs.printAll());;break;
                case 4: not1Exit = false;
                    display1();
                    option(); break;
                default:
                    System.out.println("Invalid selection. Try once more"); break;
            }
        }
    }

    public void correctPerson() {
        boolean not1Exit = true;
        while(not1Exit) {
            switch(enterNumber()) {
                case 1: System.out.println ("You correct a doctor ");
                    break;
                case 2: System.out.println ("You correct a patient ");break;
                case 3: System.out.println ("You correct a medicalstaff ");break;
                case 4: not1Exit = false;
                    display1();
                    option(); break;
                default:
                    System.out.println("Invalid selection. Try once more"); break;
            }
        }
    }

    public void saveChanges() {

            }
        }
    }
}