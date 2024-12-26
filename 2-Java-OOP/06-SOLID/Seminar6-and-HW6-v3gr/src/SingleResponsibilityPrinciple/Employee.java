package SingleResponsibilityPrinciple;

import java.util.Date;

/**
 * Класс Employee представляет собой сотрудника и основную информацию о нём.
 * Принцип единственной ответственности (Single Responsibility Principle, SRP) гласит, что класс должен иметь
 * только одну причину для изменения. Рассмотрим два класса Employee и SalaryCalculator:
 *
 * Employee:
 *
 * Ответственность: Представлять информацию о сотруднике и предоставлять метод для получения информации
 * о нем (getEmpInfo).
 * Одна причина для изменения: Изменения в способе представления информации о сотруднике
 * (например, формат вывода) будут причиной изменения в этом классе.
 * SalaryCalculator:
 *
 * Ответственность: Рассчитывать чистую зарплату на основе базовой зарплаты с учетом налога.
 * Одна причина для изменения: Изменения в логике расчета чистой зарплаты будут причиной изменения в этом классе.
 */
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    /**
     * Конструктор Employee с указанным именем, датой рождения и базовой зарплатой.
     *
     * @param name       Имя сотрудника.
     * @param dob        Дата рождения сотрудника.
     * @param baseSalary Базовая зарплата сотрудника.
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    /**
     * Получает отформатированную строку с информацией о сотруднике.
     *
     * @return Строка с именем и датой рождения сотрудника.
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
