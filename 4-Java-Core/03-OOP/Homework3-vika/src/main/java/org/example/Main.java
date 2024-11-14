package org.example;

import java.util.Arrays;

/**
 * Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
 * представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
 * Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения
 * зарплаты в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять
 * заработную плату всем, кроме руководителей. В основной программе создайте руководителя и
 * поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите,
 * чтобы зарплата руководителя не повысилась.
 */


public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "Igorevich",
                "Ovchinnikov", "739", "developer",
                50000, 1985, 7, 15);
        Employee andrey = new Employee("Andrey", "Viktorovich",
                "Bezrukov", "927",
                "fitter", 52000, 1973, 6, 25);
        Employee evgeniy = new Employee("Evgeniy", "Viktorovich",
                "Delfinov", "765",
                "project manager", 40000, 1963, 9, 8);
        Employee natalia = new Employee("Natalia", "Pavlovna",
                "Keks", "455",
                "senior developer", 90000, 1990, 2, 24);
        Employee tatiana = new Employee("Tatiana", "Sergeevna",
                "Krasotkina", "495",
                "accountant", 50000, 1983, 12, 19);
        Employee anton = new Chief("Anton", "Olegovich",
                "Martunov", "100",
                "chief", 150000, 1979, 4, 12);
        Employee[] employees = new Employee[6];
        employees[0] = ivan;
        employees[1] = andrey;
        employees[2] = evgeniy;
        employees[3] = natalia;
        employees[4] = tatiana;
        employees[5] = anton;

        Arrays.stream(employees).forEach(System.out::println);
        System.out.println("--------------------");

        Chief.increase(employees, 5000);
        Arrays.stream(employees).forEach(System.out::println);

        System.out.println("Разница в возрасте: " + ivan.compareAge(anton) + " дней.");
    }
}
