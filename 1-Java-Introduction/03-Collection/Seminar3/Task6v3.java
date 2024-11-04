/*Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. Напишите метод для заполнения даннойструктуры. 
 */
import java.util.ArrayList;
import java.util.List;

public class Task6v3 {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        
        // Заполняем каталог книг
        addGenre(catalog, "Фантастика");
        addBook(catalog, "Фантастика", "Космическая одиссея");
        addBook(catalog, "Фантастика", "1984");
        addBook(catalog, "Фантастика", "Автостопом по галактике");
        
        addGenre(catalog, "Детективы");
        addBook(catalog, "Детективы", "Убийство в Восточном экспрессе");
        addBook(catalog, "Детективы", "Уловка-22");
        
        addGenre(catalog, "Классика");
        addBook(catalog, "Классика", "Преступление и наказание");
        addBook(catalog, "Классика", "Война и мир");
        
        // Выводим каталог
        printCatalog(catalog);
    }
    
    // Метод для добавления нового жанра в каталог
    public static void addGenre(List<ArrayList<String>> catalog, String genre) {
        ArrayList<String> genreList = new ArrayList<>();
        genreList.add(genre);
        catalog.add(genreList);
    }
    
    // Метод для добавления новой книги в указанный жанр
    public static void addBook(List<ArrayList<String>> catalog, String genre, String book) {
        for (ArrayList<String> genreList : catalog) {
            if (genreList.get(0).equals(genre)) {
                genreList.add(book);
                return;
            }
        }
        
        System.out.println("Жанр " + genre + " не найден в каталоге.");
    }
    
    // Метод для вывода каталога на экран
    public static void printCatalog(List<ArrayList<String>> catalog) {
        for (ArrayList<String> genreList : catalog) {
            for (int i = 0; i < genreList.size(); i++) {
                System.out.print(genreList.get(i));
                
                if (i != genreList.size() - 1) {
                    System.out.print(", ");
                } else {
                    System.out.println();
                }
            }
        }
    }
}
