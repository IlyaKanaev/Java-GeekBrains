/*Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. Напишите метод для заполнения даннойструктуры. 
 */
// Задача: Создать класс 'Book' с приватными полями для названия, автора и количества страниц.
// Реализовать конструкторы, геттеры и сеттеры для этих полей.
// Добавить метод для вывода информации о книге.

public class Book {
    private String title;
    private String author;
    private int pageCount;

    // Конструктор класса
    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // Геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // Метод для вывода информации о книге
    public void printBookInfo() {
        System.out.println("Название книги: " + title);
        System.out.println("Автор книги: " + author);
        System.out.println("Количество страниц: " + pageCount);
    }
}

// Демонстрация использования класса
public class Task6v2 {
    public static void main(String[] args) {
        Book myBook = new Book("Война и мир", "Лев Толстой", 1225);
        myBook.printBookInfo();
    }
}