package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Chief extends Employee{
    public Chief(String name, String midName, String lastName, String phone, String position, Integer salary,
                 Integer birthY, Integer birthM, Integer birthD, Gender gender) {
        super(name, midName, lastName, phone, position, salary, birthY, birthM, birthD, gender);
    }
    public static void increase(Employee[] employees, int amount) {
        Objects.requireNonNull(employees);
        Arrays.stream(employees).filter(e -> e != null && e.getClass().isAssignableFrom(Employee.class))
                .forEach(e -> Chief.increaseSalary(e, amount));

    }
    public static void increaseSalary(Employee employee, int amount) {
        Objects.requireNonNull(employee);
        Integer salary = employee.getSalary();
        employee.setSalary(salary + amount);
    }
}