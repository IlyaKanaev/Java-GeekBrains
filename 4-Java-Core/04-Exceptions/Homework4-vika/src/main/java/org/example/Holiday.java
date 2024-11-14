package org.example;

import java.util.Date;
public class Holiday {
    public enum Holidays{NONE, NEW_YEAR, MARCH_8, FEB_23}
    private static Holidays today = declare();
    private static Holidays declare(){
        Date dateNow = new Date();
        if(dateNow.getDate() == 1 && dateNow.getMonth() == 1){
            today = Holidays.NEW_YEAR;
        } else if (dateNow.getDate() == 23 && dateNow.getMonth() == 2) {
            today = Holidays.FEB_23;
        } else if (dateNow.getDate() == 8 && dateNow.getMonth() == 3) {
            today = Holidays.MARCH_8;
        } else {
            today = Holidays.NONE;
        }
        return today;
    }

    public static void celebrate(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            switch (today) {
                case NEW_YEAR:
                    System.out.println(emp[i].getName() + ", с новым годом!");
                    break;
                case FEB_23:
                    if (emp[i].getGender() == Employee.Gender.MALE)
                        System.out.println(emp[i].getName() + ", поздравляю с днем защитника отечества!");
                    break;
                case MARCH_8:
                    if (emp[i].getGender() == Employee.Gender.FEMALE)
                        System.out.println(emp[i].getName() + ", поздравляю с 8 марта!");
                    break;
                default:
                    System.out.println(emp[i].getName() + ", добрый день!");
            }
        }
    }
}
