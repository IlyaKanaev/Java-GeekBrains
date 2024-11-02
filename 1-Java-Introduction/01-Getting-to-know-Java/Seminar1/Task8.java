package Seminar1;
/*
 * Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9Пример 2: а = 2, b = -2, ответ: 0.25Пример 3: а = 3, b = 0, ответ: 1
 */

 import java.util.Scanner;

 public class Task8 {
     public static void main(String[] args) {
         Scanner Scanner = new Scanner(System.in);
         System.out.print("Enter a number: ");
         double number = Scanner.nextDouble();
         System.out.print("Enter the degree of the integer: ");
         int degree = Scanner.nextInt();
 
         long startTime = System.nanoTime();
         System.out.println(degree(number, degree));
         long estimatedTime = (System.nanoTime() - startTime) / 1000;
         System.out.println("Estimated time (mkrsec): "+estimatedTime);
 
         startTime = System.nanoTime();
         System.out.println(Math.pow(number, degree));
         estimatedTime = (System.nanoTime() - startTime) / 1000;
         System.out.println("Estimated time (mkrsec): "+estimatedTime);
 
         startTime = System.nanoTime();
         System.out.println(powRec(number, degree));
         estimatedTime = (System.nanoTime() - startTime) / 1000;
         System.out.println("Estimated time (mkrsec): "+estimatedTime);
 
         startTime = System.nanoTime();
         System.out.println(powIter(number, degree));
         estimatedTime = (System.nanoTime() - startTime) / 1000;
         System.out.println("Estimated time (mkrsec): "+estimatedTime);
     }
 
     public static double degree(double number, int degree)   {
         double result = 1;
         if (degree == 0) return 1;
         else if (degree < 0) {
             number = 1 / number;
             degree = - degree;
         }
         for (int i = 1; i <= degree; i++)   {
             result *= number;
         }
         return result;   
     }
 
     public static double powRec(double a, int b)    {
         if (b == 0) {
             return 1;
         }
         if (b < 0)  {
             return powRec(1 / a, - b);
         }
         double res = powRec(a, b / 2);  // в какой-то момент целочисленное деление b / 2 привед к обнулению b и выходу из рекурсии
         // к тому моменту накопится соответствующее количество (...((res * res) * (res * res)) * ((res * res) * (res * res))...)
         return b % 2 == 0 ? res * res : res * res * a;  // для понимания можно сначала рассмотреть частный случай бинарной степени b
     }
     
     public static double powIter(double a, int b)   {
         if (a == 0 || a == 1) return a;
         if (b == 0) return 1;
         if (b < 0)  {
             b = - b;
             a = 1 / a;
         }
         double result = 1;
         while (b > 0)   {
             if (b % 2 == 1) {
                 result = result * a;
             }
             a = a * a;
             b = b / 2;  // интересно организован цикл. не последовательно перемножается одно и то же число, а квадраты его, что быстрее
         }
         return result;
     }
 }
