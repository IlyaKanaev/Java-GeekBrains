package Seminar1;
/*
 * Настроить проект, вывести в консоль “Hello world!”.
 * Вывести в консоль системные дату и время
 */

import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // System.out.println(System.currentTimeMillis()); // миллисекунды от даты создания UNIX
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
        // System.out.println(System.nanoTime());  // время от чего-то там связанного с созданием JVM на моем компьютере
				System.out.println(LocalDateTime.now());
    }
}