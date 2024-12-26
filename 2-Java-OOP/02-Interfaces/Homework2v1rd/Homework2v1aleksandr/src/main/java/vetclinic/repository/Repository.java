package main.java.vetclinic.repository;

import main.java.vetclinic.animals.Animal;
import main.java.vetclinic.medicalstaff.Employee;

import java.util.List;

public interface Repository {
    List<Animal> getAnimals();

    List<Employee> getEmployees();

    void addAnimal(Animal animal);

    void removeAnimal(Animal animal);

    void addEmployee(Employee employee);

    void removeEmployee(Employee employee);

    Animal findAnimalByName(String name);

    Employee findEmployeeByName(String name);
}
