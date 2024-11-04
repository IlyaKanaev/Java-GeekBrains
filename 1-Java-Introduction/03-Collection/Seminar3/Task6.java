/*Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. Напишите метод для заполнения даннойструктуры. 
 */
import java.util.ArrayList;
import java.util.List;

public class Task6 {

    static List<String> addBooks(String genre, String[] books) {
        List<String> genreList = new ArrayList<>();
        genreList.add(genre);
        for (String book : books) {
            genreList.add(book);
        }

        return genreList;
    }

    public static void main(String[] args) {
        List<List<String>> bookCatalog = new ArrayList<>();
        List<String> genreList1 = addBooks("sci-fi", new String[] { "Vanished birds", "book2", "book3" });
        List<String> genreList2 = addBooks("genre3", new String[] { "book4", "book5", "book6" });
        List<String> genreList3 = addBooks("genre2", new String[] { "book7", "book8", "book9" });

        bookCatalog.add(genreList1);
        bookCatalog.add(genreList2);
        bookCatalog.add(genreList3);

        for (var line : bookCatalog) {
            System.out.println(line);
        }
    }
}

// Variant 2
// import java.util.ArrayList;
// import java.util.List;

// public class Task4Table {
//     public static void main(String[] args) {
//         List<ArrayList<String>> listOfArrayLists = new ArrayList<>();
//         ArrayList<String> arrayProse = new ArrayList<>();
//         listOfArrayLists.add(arrayProse);
//         arrayProse.add("проза");
//         arrayProse.add("Война и мир");
//         arrayProse.add("12 Стульев");
//         ArrayList<String> arrayPoetry = new ArrayList<>();
//         listOfArrayLists.add(arrayPoetry);
//         arrayPoetry.add("поэзия");
//         arrayPoetry.add("Бородино");
//         ArrayList<String> arrayDoc = new ArrayList<>();
//         arrayDoc.add("док");
//         listOfArrayLists.add(arrayDoc);

//         // Выводим содержимое коллекции
//         for (ArrayList<String> list : listOfArrayLists) {
//             System.out.println(list);
//         }
//         System.out.println("-------------------");

//         // создаем двумерный массив-таблицу
//         int rows = 4;
//         int columns = 3;
//         String[][] booksTable = new String[rows][columns];
//         int currentColumns = 0;

//         int currentRows = 0;
//         for (String books : arrayProse) {
//             booksTable[currentRows][currentColumns] = books;
//             currentRows += 1;
//         }
//         currentRows = 0;

//         currentColumns = 1;        
//         for (String books : arrayPoetry) {
//             booksTable[currentRows][currentColumns] = books;
//             currentRows += 1;
//         }
//         currentRows = 0;

//         currentColumns = 2;        
//         for (String books : arrayDoc) {
//             booksTable[currentRows][currentColumns] = books;
//             currentRows += 1;
//         }
//         currentRows = 0;

//         // выводим содержимое двумерного массива
//         for (currentRows = 0; currentRows < rows; currentRows++) {
//             for (currentColumns = 0; currentColumns < columns; currentColumns++) {
//                 if (booksTable[currentRows][currentColumns] != null && booksTable[currentRows][currentColumns].length() > 6) // выравниваем столбцы
//                     System.out.print(booksTable[currentRows][currentColumns] + "\t");
//                 else System.out.print(booksTable[currentRows][currentColumns] + "\t\t");
//             }
//             System.out.println();
//         }
//     }
// }
