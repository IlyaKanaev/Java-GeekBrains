package Seminar1;
/* В консоли запросить имя пользователя. В зависимости оттекущего времени, вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59"Добрый день, <Имя>!", если время от 12:00 до 17:59;"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */

 import java.time.LocalTime;
 import java.util.Scanner;
 
 public class Task3 {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);   
         System.out.print("Input your name: ");
         String name = in.nextLine();
         LocalTime time = LocalTime.now();
         int hour = time.getHour();
         if (hour >= 5 && hour < 12)  System.out.println("Доброе утро, "+name);
         if (hour >= 12 && hour < 18)  System.out.println("Добрый день, "+name);
         if (hour >= 18 && hour < 23)  System.out.println("Добрый вечер, "+name);
         if (hour == 23 || hour < 5)  System.out.println("Доброй ночи, "+name);
         in.close();
     }
 }
