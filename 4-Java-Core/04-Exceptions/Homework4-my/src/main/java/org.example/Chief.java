package org.example;
import java.util.ArrayList;
import java.util.Objects;

public class Chief extends Employee{
    public Chief(String name, String midName, String lastName, String phone, String position, Integer salary,
                 Integer birthY, Integer birthM, Integer birthD, Gender gender) {
        super(name, midName, lastName, phone, position, salary, birthY, birthM, birthD, gender);
    }

    public static void increase(ArrayList<Employee> employees, int amount) {
        Objects.requireNonNull(employees);
        employees.stream().filter(emp -> emp != null && emp.getClass().isAssignableFrom(Employee.class))
                .forEach(emp -> increaseSalary(emp, amount));

    }
    public static void increaseSalary(Employee employee, int amount) {
        //Objects.requireNonNull(employee);
        employee.setSalary(employee.getSalary() + amount);
    }


}