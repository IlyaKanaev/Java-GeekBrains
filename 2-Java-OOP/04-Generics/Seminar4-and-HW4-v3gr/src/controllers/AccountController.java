package controllers;

import domain.Person;
import domain.Worker;

import java.util.ArrayList;

public class AccountController {
    /**
     * Метод выплаты зарплаты
     * @param person человек, которому выплачивают заработную плату
     * @param salar заработная плата
     * @param <T> Обобщённый тип данных наследуемый от класса Worker
     * @param <V>
     */
    public <T extends Worker, V> void paySalary(T person, V salar){
        System.out.println(person.getName() + " выплачена зарплата " + salar);
    }
    /**
     * Метод для вычисления среднего возраста людей из списка
     * @param listPersons - входной список людей
     */
    public static <T extends Person> void averageAge (ArrayList<T> listPersons){

        double sum = 0;

        for (Person person: listPersons) {
            sum += person.getAge();
        }

        System.out.println("Средний возраст: " + sum / listPersons.size());
    }
}