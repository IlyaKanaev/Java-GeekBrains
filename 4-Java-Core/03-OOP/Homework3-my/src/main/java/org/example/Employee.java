package org.example;

import java.time.Year;

public class Employee {
    private String name;
    private String midName;
    private String lastName;
    private String position;
    private String phone;
    private Integer salary;
    private Integer birthY;
    private Integer birthM;
    private Integer birthD;


    public int getAge() {
        return Year.now().getValue() - birthY;
    }

    public void info() {
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", midName='" + midName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + getAge() +
                '}');
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getBirthDate() {
        return birthY;
    }

    public void setBirthDate(Integer birthDate) {
        this.birthY = birthDate;
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

    public int compareAge(Employee emp){
        Integer age1 = this.birthD + (this.birthM * 30)  + (this.birthY * 365);
        Integer age2 = emp.birthD + (emp.birthM * 30) + (emp.birthY * 365);
        return age1 - age2;
    }


}
