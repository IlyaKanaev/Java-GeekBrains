package Seminar1;
/*
 * На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды

Решить задачу нужно с помощью рекурсии.

команда 1 (к1): увеличить в с раза, а умножается на c

команда 2 (к2): увеличить на d ( +2 ), к a прибавляется dНаписать программу, которая выдаёт набор команд, позволяющий число aпревратить в число b или сообщить, что это невозможноПример 1: а = 1, b = 7, c = 1, d = 3ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1.Пример 2: а = 11, b = 7, c = 2, d = 1ответ: “”.
 */

 import java.util.Scanner;

 public class Task9 {
     public static void main(String[] args) {
         Scanner Scanner = new Scanner(System.in);
         System.out.print("Enter the initial value: ");
         int source = Scanner.nextInt();
         System.out.print("Enter the final value: ");
         int target = Scanner.nextInt();
         System.out.print("Enter the number c: ");
         int c = Scanner.nextInt();
         System.out.print("Enter the number d: ");
         int d = Scanner.nextInt();
         String path = "";
         generate(source, target, c, d, path);
     }
 
     public static void generate(int source, int target, int c, int d, String path)  {
         if (source > target) return;
         if (source == target)   {
             System.out.println(path);
             return;
         }
         generate(source + c, target, c, d, path + "k1");
         generate(source + d, target, c, d, path + "k2");
     }
 }
