package Homework1;
/*
 * Вывести все простые числа от 1 до 1000

Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.Напишите свой код в методе printPrimeNums класса Answer.

// Пример:
2
3
5
7
11
...
 */
class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        int number = 1000;
        int ctr = 4;
        int n = 4;
        System.out.println(2);
        System.out.println(3);
        while (ctr <= number)    {
            n++;
            if (n % 2 != 0) {  // оптимизируем алгоритм, убирая все четные числа
                if (is_Prime(n))    {
                    System.out.println(n);
                }
            }
            ctr++;
        }
    }
  
    public static boolean is_Prime(int num) {
        for (int i = 3; i * i <= num; i+= 2) {  // оптимизируем поиск до корня из диапазона
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }  
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2{ 
    public static void main(String[] args) { 
      
      Answer ans = new Answer();      
      ans.printPrimeNums();
    }
}

// Variant 2
// class Answer {
//        public static void printPrimeNums() {
//         // Напишите свое решение ниже

//         // Проход начинается с 2, т.к. это число является наименьшим простым
//         for (int i = 2; i <= 1000; i++) {

//             boolean isPrime = true;

//             // Проверка, является ли число i простым
//             // Проход по циклу до корня числа,
//             // т.к. дальше нет смысла искать, делителей нет.
//             for (int j = 2; j <= Math.sqrt(i); j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             // Если число i простое, вывод его на экран
//             if (isPrime)
//                 System.out.println(i);
//         }
//     }
// }

// public class Printer{ 
//     public static void main(String[] args) { 

//       Answer ans = new Answer();      
//       ans.printPrimeNums();
//     }
// }
