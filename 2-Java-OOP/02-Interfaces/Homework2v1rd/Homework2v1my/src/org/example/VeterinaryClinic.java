package org.example;

import org.example.animals.Animal;
import org.example.interfaces.Flyable;
import org.example.interfaces.Goable;
import org.example.interfaces.Swimable;
import org.example.personal.Personal;
import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {

    //Придумываем поля для нашего класса. Для начала и вообще - private
    // Во-первых нужен список персонала. Создадим под персонал отдельный класс
    private List<Personal> personal;
    //нужен также список животных
    private List<Animal> patients;
    // почему таким способом не совсем понятно, но узнаем позже

    public VeterinaryClinic() {
        this.personal = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addPatient(Animal a) {
        patients.add(a);
    }

    // выписка пациента
    public void removePatient(Animal p) {
        System.out.println("-------------");
        patients.remove(p);
        System.out.println(p + " - вылечен");
        System.out.println("-------------");
    }

    public void addPersonal(Personal a) {
        personal.add(a);
    }

    public void getPatients() {
        System.out.println("-------------");
        System.out.println("Список пациентов ветеринарной клиники:");
        for (Animal a : patients) {
            System.out.println(a);
        }
        System.out.println("-------------");
    }

    public void addEmployee(Personal employee) {
        personal.add(employee);
    }

    public void getProfiles() {
        System.out.println("-------------");
        System.out.println("Вывод списка пациентов с дополнительной информацией по скоростям: ");
        for (Animal a : patients) {
            System.out.println(a);
            if (a instanceof Goable) {
                System.out.println(a.getType() + " бегает со скоростью " + ((Goable) a).run());
            }
            if (a instanceof Flyable) {
                System.out.println(a.getType() + " летает со скоростью " + ((Flyable) a).fly());
            }
            if (a instanceof Swimable) {
                System.out.println(a.getType() + " плавает со скоростью " + ((Swimable) a).swim());
            }
            System.out.println("-------------");
        }
    }

    public void getFlyables() {
        System.out.println("-------------");
        System.out.println("Пациенты клиники, которые умеют летать:");
        for (Animal a : patients) {
            if (a instanceof Flyable) {
                System.out.println(a);
            }
        }
        System.out.println("-------------");
    }

    public void getSwimables() {
        System.out.println("-------------");
        System.out.println("Пациенты клиники, которые умеют плавать:");
        for (Animal a : patients) {
            if (a instanceof Swimable) {
                System.out.println(a);
            }
        }
        System.out.println("-------------");
    }

    public void getGoables() {
        System.out.println("-------------");
        System.out.println("Пациенты клиники, которые умеют ходить:");
        for (Animal a : patients) {
            if (a instanceof Goable) {
                System.out.println(a);
            }
        }
        System.out.println("-------------");
    }

    public void getPersonal() {
        System.out.println("-------------");
        System.out.println("Список персонала клиники:");
        for (Personal a : personal) {
            System.out.println(a);
        }
        System.out.println("-------------");
    }

    public void removePersonal(Personal p) {
        System.out.println("-------------");
        personal.remove(p);
        System.out.println(p + " - уволен");
        System.out.println("-------------");
    }
}
