package main.java.vetclinic.medicalstaff.impl;

import main.java.vetclinic.animals.Animal;
import main.java.vetclinic.medicalstaff.Employee;
import main.java.vetclinic.medicalstaff.Gender;

public class Nurse extends Employee {

    public Nurse(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public void makeVaccination(Animal patient) {
        if (patient != null && !patient.getIsVaccinated())
            patient.setIsVaccinated(true);
        else System.out.println("Vaccination is not possible");
    }
}
