package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ivan", "Igorevich",
                "Ovchinnikov", "739", "developer",
                50000, 1985, 7, 15, Employee.Gender.MALE));
        employees.add(new Employee("Andrey", "Viktorovich",
                "Bezrukov", "927",
                "fitter", 52000, 1973, 6, 25, Employee.Gender.MALE));
        employees.add(new Employee("Evgeniy", "Viktorovich",
                "Delfinov", "765",
                "project manager", 40000, 1963, 9, 8, Employee.Gender.MALE));
        employees.add(new Employee("Natalia", "Pavlovna",
                "Keks", "455",
                "senior developer", 90000, 1990, 2, 24, Employee.Gender.FEMALE));
        employees.add(new Employee("Tatiana", "Sergeevna",
                "Krasotkina", "495",
                "accountant", 50000, 1983, 12, 19, Employee.Gender.FEMALE));
        employees.add(new Chief("Anton", "Olegovich",
                "Martunov", "100",
                "chief", 150000, 1979, 4, 12, Employee.Gender.MALE));


        employees.forEach(System.out::println);
        System.out.println();

        Holiday.celebrate(employees);
    }
}
