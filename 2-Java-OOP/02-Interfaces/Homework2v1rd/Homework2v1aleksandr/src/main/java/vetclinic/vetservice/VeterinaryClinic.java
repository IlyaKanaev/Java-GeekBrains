package main.java.vetclinic.vetservice;

import main.java.vetclinic.animals.Animal;
import main.java.vetclinic.animals.Flyable;
import main.java.vetclinic.animals.Swimable;
import main.java.vetclinic.animals.Walkable;
import main.java.vetclinic.medicalstaff.Employee;
import main.java.vetclinic.medicalstaff.impl.Doctor;
import main.java.vetclinic.medicalstaff.impl.Nurse;

import java.util.List;
import java.util.Set;

public interface VeterinaryClinic {
    void getPatients();

    Animal getPatientByName(String name);

    void getProfiles();

    Set<String> getTypes();

    void getWalkables();

    List<Flyable> getFlyables();

    void getSwimables();

    void getEmployees();

    Employee getEmployeeByName(String name);

    List<Doctor> getDoctors();

    List<Nurse> getNurses();

    void registerNewPatient(Animal patient);

    void dischargePatient(Animal patient);

    void hireEmployee(Employee employee);

    void fireEmployee(Employee employee);
}
