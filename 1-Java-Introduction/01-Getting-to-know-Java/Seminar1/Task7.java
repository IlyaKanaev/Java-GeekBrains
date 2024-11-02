package Seminar1;
/*
 * Во фразе "Добро пожаловать на курс по Java" переставить словав обратном порядке.
Для разбивки фразы на отдельные слова можноиспользовать метод split() класса String, которомунужно передать символ разделителя.
 */

 public class Task7 {
    public static void main(String[] args) {
        String sentence = "Добро пожаловать на курс по Java";
        System.out.println(sentence);
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) System.out.print(words[i] + " ");
    }
}
