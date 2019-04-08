package com.company;


public class FactoryDPM {
    public Doctor createDoctor(String name, String department) {
        return new Doctor(name, department);
    }
    public Patient createPatient(String name, String diagnosis, int num){
        return new Patient(name, diagnosis, num);
    }
    public Medicalstaff createMedicalstaff(String name, String qualification){
        return new Medicalstaff(name, qualification);
    }



}
