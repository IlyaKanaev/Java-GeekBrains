/*
Напишите программу, которая использует Stream API для обработки списка
чисел. Программа должна вывести на экран среднее значение всех четных
чисел в списке.
 */
 import java.util.Arrays;
 import java.util.List;

 public class Homework1 {
     public static void main(String[] args) {
         List<Integer> nums = Arrays.asList(1,3,4,5,6,7,8,9,10);
         System.out.println("List of numbers: " + nums);
         double averageOfEven = nums.stream()
                 .filter(num -> num % 2 == 0)
                 .mapToDouble(Integer::doubleValue)
                 .average()
                 .orElse(0.0);
         System.out.println("Average value of even numbers: " + averageOfEven);
     }
 }