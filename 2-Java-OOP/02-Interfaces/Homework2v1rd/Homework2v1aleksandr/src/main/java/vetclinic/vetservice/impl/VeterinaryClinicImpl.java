package main.java.vetclinic.vetservice.impl;

import main.java.vetclinic.animals.Animal;
import main.java.vetclinic.animals.Flyable;
import main.java.vetclinic.animals.Swimable;
import main.java.vetclinic.animals.Walkable;
import main.java.vetclinic.factory.Factory;
import main.java.vetclinic.medicalstaff.Employee;
import main.java.vetclinic.medicalstaff.impl.Doctor;
import main.java.vetclinic.medicalstaff.impl.Nurse;
import main.java.vetclinic.repository.Repository;
import main.java.vetclinic.vetservice.VeterinaryClinic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class VeterinaryClinicImpl implements VeterinaryClinic {

    private final Repository repository;

    private static VeterinaryClinic instance;

    private VeterinaryClinicImpl() {
        this.repository = Factory.getRepository();
    }

    public static VeterinaryClinic getInstance() {
        if (instance == null) {
            instance = new VeterinaryClinicImpl();
        }
        return instance;
    }

    @Override
    public void getPatients() {
        for (Animal a : repository.getAnimals()) {
            System.out.println(a);
        }
    }

    @Override
    public void registerNewPatient(Animal patient) {
        repository.addAnimal(patient);
    }

    @Override
    public void dischargePatient(Animal patient) {
        repository.removeAnimal(patient);
    }

    @Override
    public Animal getPatientByName(String name) {
        return repository.findAnimalByName(name);
    }

    @Override
    public void getProfiles() {
        System.out.println("\nSee patients profiles below: ");
        for (Animal a : repository.getAnimals()) {
            System.out.println(a);
            if (a instanceof Walkable) {
                System.out.println(a.getType() + " runs at a speed " + ((Walkable) a).run());
            }
            if (a instanceof Flyable) {
                System.out.println(a.getType() + " flies at a speed " + ((Flyable) a).fly());
            }
            if (a instanceof Swimable) {
                System.out.println(a.getType() + " swims at a speed " + ((Swimable) a).swim());
            }
            System.out.println("-------------");
        }
    }

    @Override
    public Set<String> getTypes() {
        return repository.getAnimals().stream().map(Animal::getType).collect(Collectors.toSet());
    }

    @Override
    public void getWalkables() {
        System.out.println("\nWallkables are: ");
        List<Animal> animals = repository.getAnimals();
        List<Walkable> walkables = new ArrayList<>();
        for (int i = 0, j = 0; i < animals.size(); i++) {
            try {
                walkables.add((Walkable) animals.get(i));
                System.out.println(walkables.get(j));
                j++;
            } catch (ClassCastException e) {
                i++;
            }
        }
    }

    @Override
    public List<Flyable> getFlyables() {
        List<Flyable> flyables = new ArrayList<>();
        for (Animal a : repository.getAnimals()) {
            if (a instanceof Flyable) {
                flyables.add((Flyable) a);
            }
        }
        return flyables;
    }

    @Override
    public void getSwimables() {
        System.out.println("\nSwimables are: ");
        for (Animal a : repository.getAnimals()) {
            if (a instanceof Swimable) {
                System.out.println(a.getName());
            }
        }
    }


    @Override
    public void getEmployees() {
        for (Employee e : repository.getEmployees()) {
            System.out.println(e.getInfo());
        }
    }

    public Employee getEmployeeByName(String name) {
        return repository.findEmployeeByName(name);
    }

    @Override
    public void hireEmployee(Employee employee) {
        repository.addEmployee(employee);
    }

    @Override
    public void fireEmployee(Employee employee) {
        repository.removeEmployee(employee);
    }

    @Override
    public List<Doctor> getDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        for (Employee e : repository.getEmployees()) {
            if (e instanceof Doctor) {
                doctors.add((Doctor) e);
            }
        }
        return doctors;
    }

    @Override
    public List<Nurse> getNurses() {
        List<Nurse> nurses = new ArrayList<>();
        for (Employee e : repository.getEmployees()) {
            if (e instanceof Nurse) {
                nurses.add((Nurse) e);
            }
        }
        return nurses;
    }
}
