package org.example;

import org.example.components.Penicillin;
import org.example.components.Salt;
import org.example.components.Water;
import org.example.pharmacy.Pharmacy;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        Pharmacy helpirin = new Pharmacy("helpirin");
        Pharmacy safirin = new Pharmacy("safirin");
        Pharmacy curin = new Pharmacy("curin");

        helpirin
                .addComponent(new Penicillin("PenicillinH", 10, 100))
                .addComponent(new Water("WaterH", 20, 15))
                .addComponent(new Salt("SaltH", 50, 50));

        safirin
                .addComponent(new Penicillin("PenicillinS", 5, 80))
                .addComponent(new Water("WaterS", 10, 10))
                .addComponent(new Salt("SaltS", 3, 300));
        curin
                .addComponent(new Penicillin("PenicillinS", 25, 120))
                .addComponent(new Water("WaterS", 30, 25))
                .addComponent(new Salt("SaltS", 7, 70));

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(helpirin);
        pharmacies.add(safirin);
        pharmacies.add(curin);

        for (Pharmacy p : pharmacies) {
            System.out.println(Pharmacy.allPowers(p));
        }
        System.out.println();

        // сортируем по сумме power компонентов
        Collections.sort(pharmacies);
        for (Pharmacy p : pharmacies) {
            System.out.println(Pharmacy.allPowers(p));
        }
    }
}