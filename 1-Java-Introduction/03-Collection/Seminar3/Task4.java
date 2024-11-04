/*
 * Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
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
        Set<String> list = new TreeSet<String>(solarPlanets2);
        System.out.println(list);  
    }
}

// Variant 2
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Iterator;
// import java.util.List;

// public class Planets {

//     static List<String> makeRandomPlanetsList() {
//         List<String> randomPlanets = new ArrayList<>();
//         randomPlanets.add("Earth");
//         randomPlanets.add("Mars");
//         randomPlanets.add("Jupiter");
//         randomPlanets.add("Earth");
//         randomPlanets.add("Mercury");
//         randomPlanets.add("Neptune");
//         randomPlanets.add("Earth");
//         randomPlanets.add("Mars");
//         randomPlanets.add("Uranus");
//         randomPlanets.add("Venus");
//         randomPlanets.add("Saturn");
//         randomPlanets.add("Saturn");

//         return randomPlanets;
//     }

//     static void countRepeatPlanets(List<String> planets) {
//         Collections.sort(planets);

//         String currentPlanet = planets.get(0);
//         int counter = 1;

//         for (int i = 1; i < planets.size(); i++) {
//             if (planets.get(i).equals(currentPlanet)) {
//                 counter++;
//             } else {
//                 System.out.printf("%s\t%d\n", currentPlanet, counter);
//                 counter = 1;
//                 currentPlanet = planets.get(i);
//             }
//         }
//         System.out.printf("%s\t%d\n", currentPlanet, counter);
//     }

//     static void removeDuplicates(List<String> planets) {
//         Collections.sort(planets);

//         String currentPlanet = "";
//         int meetCounter = 0;
//         Iterator<String> planetsIter = planets.iterator();

//         while (planetsIter.hasNext()) {
//             String pl = planetsIter.next();
//             if (currentPlanet.equals(pl) && meetCounter > 0) {
//                 planetsIter.remove();
//             } else {
//                 meetCounter = 0;
//                 currentPlanet = pl;
//             }
//             meetCounter++;
//         }
//     }

//     static void removeDuplicates2(List<String> planets) {
//         Collections.sort(planets);

//         for (int i = planets.size() - 1; i > 0; i--) {
//             if (planets.get(i).equals(planets.get(i - 1))) {
//                 planets.remove(i);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         List<String> randomPlanets = makeRandomPlanetsList();
//         System.out.println(randomPlanets);
//         countRepeatPlanets(new ArrayList<>(randomPlanets));
//         removeDuplicates2(randomPlanets);
//         System.out.println(randomPlanets);
//     }
// }
