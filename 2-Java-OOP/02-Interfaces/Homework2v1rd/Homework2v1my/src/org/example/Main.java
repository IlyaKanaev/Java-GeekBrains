package org.example;

import org.example.animals.*;
import org.example.personal.Doctor;
import org.example.personal.Nurse;

public class Main {

    public static void main(String[] args) {
// создаем экземпляр класса нашей клиники
        VeterinaryClinic clinic = new VeterinaryClinic();

// создаем экземпляры животных для нашей клиники
        Animal kuzya = new Parrot("Кузя", new Illness("слабость"), 2022);
        Animal jack = new Dog("Джек");
        Animal donald = new Duck("Дональд");
        Animal vanda = new Guppy("Ванда");
        Animal dog = new Dog();

// заполняем одно из полей класса clinic информацией о пациентах
        clinic.addPatient(kuzya);
        clinic.addPatient(jack);
        clinic.addPatient(donald);
        clinic.addPatient(vanda);
        clinic.addPatient(dog);

        //1.Вывод списка пациентов (тип, имя, ГР, диагноз)
        clinic.getPatients();
        System.out.println("-------------------------------------------------------------");

        //2. Вывод списка пациентов с доп. информацией по движениям
        clinic.getProfiles();
        System.out.println("-------------------------------------------------------------");

        //фильтрация пациентов по способам передвижения
        clinic.getGoables();
        clinic.getFlyables();
        clinic.getSwimables();

        //выписка пациента и вывод нового списка пациентов клиники
        clinic.removePatient(kuzya);
        clinic.getPatients();

        System.out.println("-------------------------------------------------------------");
        //создаем экземпляры персонала для нашей клиники
        Nurse amanda = new Nurse("Аманда Колобкова", 2000);
        Nurse lenka = new Nurse("Елена Тимофеева", 1986);
        Doctor alex = new Doctor("Александр Репин", 1994);
        Doctor slava = new Doctor("Вячеслав Володин", 1956);

        //заполняем одно из полей класса clinic информацией о персонале
        clinic.addPersonal(amanda);
        clinic.addPersonal(lenka);
        clinic.addPersonal(alex);
        clinic.addPersonal(slava);

        //вывод списка персонала
        clinic.getPersonal();

        //увольнение сотрудника
        clinic.removePersonal(slava);
        clinic.getPersonal();

        //постановка диагноза доктором
        System.out.println(jack);
        alex.doDiagnose(jack);
        System.out.println(jack);

        //проведение процедуры медсестрой
        lenka.doProcedure(jack);
    }
}
