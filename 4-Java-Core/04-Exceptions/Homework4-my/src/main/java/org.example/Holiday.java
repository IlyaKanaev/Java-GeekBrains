package org.example;

import java.util.ArrayList;
import java.util.Calendar;
public class Holiday {
    public enum Holidays{NONE, NEW_YEAR, MARCH_8, FEB_23}
    private static Holidays today = declare();

    // 2. Добавить в основную программу перечисление с праздниками
    //(нет праздника, Новый Год, 8 марта, 23 февраля),
    private static Holidays declare(){

        Calendar cal = Calendar.getInstance();
        if(cal.get(Calendar.DATE) == 1 && cal.get(Calendar.MONTH) == Calendar.JANUARY){
            today = Holidays.NEW_YEAR;
        } else if (cal.get(Calendar.DATE) == 23 && cal.get(Calendar.MONTH) == Calendar.FEBRUARY) {
            today = Holidays.FEB_23;
        } else if (cal.get(Calendar.DATE) == 8 && cal.get(Calendar.MONTH) == Calendar.MARCH) {
            today = Holidays.MARCH_8;
        } else {
            today = Holidays.NONE;
        }
        return today;
    }

    // 2. написать метод, принимающий массив сотрудников,
    // поздравляющий всех сотрудников с Новым Годом, женщин с 8 марта,
    // а мужчин с 23 февраля, если сегодня соответствующий день.
    public static void celebrate(ArrayList<Employee> emp) {
        for (int i = 0; i < emp.size(); i++) {
            switch (today) {
                case NEW_YEAR:
                    System.out.println(emp.get(i).getName() + ", с Новым годом!");
                    break;
                case FEB_23:
                    if (emp.get(i).getGender() == Employee.Gender.MALE)
                        System.out.println(emp.get(i).getName() + ", поздравляю с Днем защитника отечества!");
                    break;
                case MARCH_8:
                    if (emp.get(i).getGender() == Employee.Gender.FEMALE)
                        System.out.println(emp.get(i).getName() + ", поздравляю с 8 марта!");
                    break;
                default:
                    System.out.println(emp.get(i).getName() + ", добрый день!");
            }
        }
    }
}
