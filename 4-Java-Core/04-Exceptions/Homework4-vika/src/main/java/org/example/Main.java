package org.example;

import java.util.Arrays;

import static org.example.Employee.Gender.FEMALE;
import static org.example.Employee.Gender.MALE;


/**
 * В класс покупателя добавить перечисление с гендерами, добавить в сотрудника свойство «пол»
 * со значением созданного перечисления. Добавить геттеры, сеттеры.
 * Добавить в основную программу перечисление с праздниками (нет праздника, Новый Год, 8 марта,
 * 23 февраля), написать метод, принимающий массив сотрудников, поздравляющий всех сотрудников
 * с Новым Годом, женщин с 8 марта, а мужчин с 23 февраля, если сегодня соответствующий день.
 */

public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "Igorevich",
                "Ovchinnikov", "739",
                "developer", 50000, 1985, 7, 15, MALE);
        Employee andrey = new Employee("Andrey", "Viktorovich",
                "Bezrukov", "927",
                "fitter", 52000, 1973, 6, 25, MALE);
        Employee evgeniy = new Employee("Evgeniy", "Viktorovich",
                "Delfinov", "765",
                "project manager", 40000, 1963, 9, 8, MALE);
        Employee natalia = new Employee("Natalia", "Pavlovna",
                "Keks", "455",
                "senior developer", 90000, 1990, 2, 24, FEMALE);
        Employee tatiana = new Employee("Tatiana", "Sergeevna",
                "Krasotkina", "495",
                "accountant", 50000, 1983, 12, 19, FEMALE);
        Employee anton = new Chief("Anton", "Olegovich",
                "Martunov", "100",
                "chief", 150000, 1979, 4, 12, MALE);
        Employee[] employees = new Employee[6];
        employees[0] = ivan;
        employees[1] = andrey;
        employees[2] = evgeniy;
        employees[3] = natalia;
        employees[4] = tatiana;
        employees[5] = anton;

        Arrays.stream(employees).forEach(System.out::println);
        System.out.println("--------------------");

        Holiday.celebrate(employees);
//        Chief.increase(employees, 5000);
//        Arrays.stream(employees).forEach(System.out::println);
//
//        System.out.println("Разница в возрасте: " + ivan.compareAge(anton) + " дней.");
    }


}
