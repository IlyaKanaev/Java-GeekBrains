package main.java.vetclinic.repository;

import main.java.vetclinic.animals.Animal;
import main.java.vetclinic.medicalstaff.Employee;

import java.util.ArrayList;
import java.util.List;

public class RepositoryImpl implements Repository {
    private List<Animal> animals;
    private List<Employee> employees;

    private static Repository instance;

    private RepositoryImpl() {
        this.animals = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public static Repository getInstance() {
        if (instance == null) {
            instance = new RepositoryImpl();
        }
        return instance;
    }

    @Override
    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee findEmployeeByName(String name) {
        for (Employee e : employees) {
            if (name.equals(e.getName())) return e;
        }
        return null;
    }

    @Override
    public Animal findAnimalByName(String name) {
        try {
            for (Animal a : animals) {
                if (name.equals(a.getName())) return a;
            }
        } catch (NullPointerException e) {
            throw new RuntimeException("Patient not found");
        }
        return null;
    }
}
