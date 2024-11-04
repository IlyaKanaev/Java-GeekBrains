/*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.Вывести название каждой планеты и количество его повторений в списке.
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        List<String> solarPlanets = new ArrayList<String>();
        solarPlanets.add("Меркурий");
        solarPlanets.add("Венера");
        solarPlanets.add("Земля");
        solarPlanets.add("Марс");
        solarPlanets.add("Юпитер");
        solarPlanets.add("Сатурн");
        solarPlanets.add("Уран");
        solarPlanets.add("Нептун");
        int listLength = 10;
        List<String> solarPlanets2 = new ArrayList<String>();
        Random random = new Random();
        for (int i = 0; i < listLength; i++) {
            solarPlanets2.add(solarPlanets.get(random.nextInt(solarPlanets.size())));
        } 
        System.out.println(solarPlanets2);
        Collections.sort(solarPlanets2); 
        System.out.println(solarPlanets2);
        int count = 0;
        String currentPlanet = solarPlanets2.get(0);
        for (String planet : solarPlanets2) {
            if (currentPlanet.equals(planet)) {
                count += 1;
            } else {
                System.out.println(currentPlanet + " = " + count);
                currentPlanet = planet;
                count = 1;
            }
        }
        System.out.println(currentPlanet + " = " + count);  
    }
}
