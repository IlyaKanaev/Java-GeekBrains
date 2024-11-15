package org.example;

public class Employee {
    private final String name;
    private final String midName;
    private final String lastName;
    private final String position;
    private final String phone;
    private Integer salary;
    private final Integer birthY;
    private final Integer birthM;
    private final Integer birthD;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", midName='" + midName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthY +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Employee(String name, String midName, String lastName, String phone, String position, Integer salary,
                    Integer birthY, Integer birthM, Integer birthD) {
        this.name = name;
        this.midName = midName;
        this.lastName = lastName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birthY = birthY;
        this.birthM = birthM;
        this.birthD = birthD;
    }

    public boolean compareAge(Employee emp){
        return this.birthD.equals(emp.birthD) && this.birthM.equals(emp.birthM) && this.birthY.equals(emp.birthY);
    }
}
