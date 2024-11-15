package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ivan", "Igorevich",
                "Ovchinnikov", "739", "developer",
                50000, 1985, 7, 15));
        employees.add(new Employee("Ivan", "Igorevich",
                "Ovchinnikov", "739", "developer",
                50000, 1985, 7, 15));
        employees.add(new Employee("Andrey", "Viktorovich",
                "Bezrukov", "927",
                "fitter", 52000, 1973, 6, 25));
        employees.add(new Employee("Evgeniy", "Viktorovich",
                "Delfinov", "765",
                "project manager", 40000, 1963, 9, 8));
        employees.add(new Employee("Natalia", "Pavlovna",
                "Keks", "455",
                "senior developer", 90000, 1990, 2, 24));
        employees.add(new Employee("Tatiana", "Sergeevna",
                "Krasotkina", "495",
                "accountant", 50000, 1983, 12, 19));
        employees.add(new Chief("Anton", "Olegovich",
                "Martunov", "100",
                "chief", 150000, 1979, 4, 12));


        employees.forEach(System.out::println);
        System.out.println();

        Chief.increase(employees, 5000);
        employees.forEach(System.out::println);
        System.out.println();

        System.out.println("Возраст " + employees.get(0).getName() + " и " + employees.get(5).getName() +
                " одинаковый? " + employees.get(0).compareAge(employees.get(5)));
    }
}
