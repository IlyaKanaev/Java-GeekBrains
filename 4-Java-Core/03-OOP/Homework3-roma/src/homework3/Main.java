package homework3;
/* 1. Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты, представленные в виде
 *трёх чисел гггг-мм-дд, без использования условного оператора.
 * 2. Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс
 * руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
 * В основной программе создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем
 * сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 **/

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "Igorevich",
                "Ovchinnikov", "8(495)000-11-22",
                "developer", 50000, 1985);
        Employee andrey = new Employee("Andrey", "Viktorovich",
                "Bezrukov", "8(495)111-22-33",
                "fitter", 52000, 1973);
        Employee evgeniy = new Employee("Evgeniy", "Viktorovich",
                "Delfinov", "8(495)222-33-44",
                "project manager", 40000, 1963);
        Employee natalia = new Employee("Natalia", "Pavlovna",
                "Keks", "8(495)333-44-55",
                "senior developer", 90000, 1990);
        Employee tatiana = new Employee("Tatiana", "Sergeevna",
                "Krasotkina", "8(495)444-55-66",
                "accountant", 50000, 1983);
        Employee alexei = new Manager("Alexei", "Vladimirovich",
                "Bobylev", "8(495)777-66-00", "manager", 250000, 1987, 5, 30);
        Employee[] employees = new Employee[6];
        employees[0] = ivan;
        employees[1] = andrey;
        employees[2] = evgeniy;
        employees[3] = natalia;
        employees[4] = tatiana;
        employees[5] = alexei;
        int[] salBeforeIncrease = {ivan.getSalary(), andrey.getSalary(), evgeniy.getSalary(), natalia.getSalary(),
                tatiana.getSalary(), alexei.getSalary()};
        System.out.println("Зарплаты до повышения" + Arrays.toString(salBeforeIncrease));

        Manager.increaser(employees, 45, 5000);

        int[] salAfterIncrease = {ivan.getSalary(), andrey.getSalary(), evgeniy.getSalary(), natalia.getSalary(),
                tatiana.getSalary(), alexei.getSalary()};
        System.out.println("Зарплаты после повышения" + Arrays.toString(salAfterIncrease));

        Employee emp1 = new Employee("Roman", "Vladimirovich",
                "Kuzmich", "8(495)222-33-44",
                "developer", 80000, 1986, 3, 25);
        Employee emp2 = new Employee("Nikolay", "Evgenievich",
                "Artemov", "8(495)555-22-55",
                "manager", 200000, 1985, 12, 18);
        System.out.println(emp1.compareAge(emp2));
        System.out.println(emp2.compareAge(emp1));
    }
}
