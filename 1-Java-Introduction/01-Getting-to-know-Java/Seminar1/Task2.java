package Seminar1;
/*
 * Написать программу, которая запросит пользователя 
 * ввести <Имя> в консоли. Получит введенную строку 
 * и выведет в консоль сообщение“Привет, <Имя>!”
 */

 import java.util.Scanner;

 public class Task2 {
     public static void main(String[] args) {
     // Scanner in = new Scanner(System.in, "UTF-8");   
     // имена в кириллице у меня VS Code не принимает
     Scanner in = new Scanner(System.in, "ibm866");
    System.out.print("Input your name: ");
     String name = in.next();    // чем плох метод next() в сравнении с nextLine()?
     System.out.format("Привет, %s", name);
     in.close();
     }   
 }
