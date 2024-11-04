/*Создать список типа ArrayList<String>.

Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task5 {

    static boolean isNumber (String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }        
    }

    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<>(Arrays.asList("10", "Black", "20g", "White", "30", "Pink"));
        Iterator<String> iterator = listStrings.iterator();
        while (iterator.hasNext()) {
            String temp = iterator.next();
            // Variant 3
            // if (temp.matches("\\d+")) {
            //     iterator.remove();
            // }
            if (isNumber(temp)) {
                iterator.remove();
            }
        }
        // Variant 2
        // List<String> listStrings2 = new ArrayList<>();
        // for (String element : listStrings) {
        //     if (!element.matches("\\d+")) {
        //         listStrings2.add(element);
        //     }
        // }
        System.out.println(listStrings);
    }
}

// Variant 4
// import java.util.ArrayList;
// import java.util.List;

// public class Task3ArrayOnlyString {
//     public static void main(String[] args) {
//     List<String> listStrings = new ArrayList<String>();
//     listStrings.add("10");
//     listStrings.add("Black");
//     listStrings.add("20");
//     listStrings.add("White");
//     listStrings.add("30");    
//     listStrings.add("Red");
//     System.out.println("Original ArrayList: " + listStrings);
//     List<String> listStrings2 = new ArrayList<String>();
//     for (String element : listStrings) {
//         if (!element.matches("\\d+")) {
//             listStrings2.add(element);
//         }
//     }
//     System.out.println("ArrayList with string only: " + listStrings2);
//     }
// }


// Variant 5
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Task3ArrayOnlyString {
//     public static void main(String[] args) {
//     String[] arrayString = new String[] {"10", "Black", "20", " White", "30", "Red"};
//     List<String> listStrings = new ArrayList<String>(Arrays.asList(arrayString));
//     System.out.println("Original ArrayList: " + listStrings);
//     List<String> listStrings2 = new ArrayList<String>();
//     for (String element : listStrings) {
//         if (!element.matches("\\d+")) {
//             listStrings2.add(element);
//         }
//     }
//     System.out.println("ArrayList with string only: " + listStrings2);
//     }
// }
