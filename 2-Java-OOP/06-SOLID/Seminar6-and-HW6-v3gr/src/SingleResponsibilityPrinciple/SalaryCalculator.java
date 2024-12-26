package SingleResponsibilityPrinciple;

/**
 * Класс SalaryCalculator представляет собой калькулятор для расчета чистой зарплаты.
 */
public class SalaryCalculator {

    /**
     * Рассчитывает чистую зарплату на основе базовой зарплаты с использованием заданной формулы налогообложения.
     *
     * @param baseSalary Базовая зарплата сотрудника.
     * @return Чистая зарплата после вычета налогов.
     */
    public int calculateNetSalary(int baseSalary) {
        // Подсчитываем налог как 25% от базовой зарплаты
        int tax = (int) (baseSalary * 0.25); // calculate in other way

        // Возвращаем чистую зарплату после вычета налогов
        return baseSalary - tax;
    }
}
