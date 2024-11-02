package Seminar1;
/*
 * Записать в файл следующие данные:
Name Surname AgeKate Smith 20Paul Green 25Mike Black 23
Можно использовать FileWrite
 */

 import  java.io.BufferedReader;
 import  java.io.IOException;
 import  java.io.FileReader;
 import  java.io.FileWriter;
 public class Task11 {
     public static void main(String[] args) {
         StringBuilder sb = new StringBuilder();
         String strLine = "";
         try {
                 String filename = "C:/Users/79155/Desktop/gb_education/Java/GB_Tasks/Sem_1/xyz.txt";
                 FileWriter fw = new FileWriter(filename, false); // проверяем наличие файла (если нет - создаем) и удаляем старые данные в нем
                 fw = new FileWriter(filename, true); // флаг true позволяет добавлять данные не стирая предыдущие
                 fw.write("Name Surname Age\n");
                 fw.write("Kate Smith 20\n");
                 fw.write("Paul Green 25\n");
                 fw.write("Mike Black 23\n");
                 fw.close();
                 BufferedReader br = new BufferedReader(new FileReader("C:/Users/79155/Desktop/gb_education/Java/GB_Tasks/Sem_1/xyz.txt"));
                 // чтение из файла
                 while (strLine != null) {
                     sb.append(strLine);
                     //sb.append(System.lineSeparator()); // закомментировал т.к. не знаю, зачем он вообще нужен
                     strLine = br.readLine();
                     if (strLine != null) {
                         System.out.println(strLine);
                     }
             }
             br.close();
         } catch (IOException ioe) {
             System.err.println("IOException: " + ioe.getMessage());
         }        
     }
 }
