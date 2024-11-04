package Homework2;
/*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

Условие:

Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:

int[] arr - числовой массив

После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}. Для логирования использовать логгер logger класса BubbleSort.

Пример:

arr = new int[]{9, 4, 8, 3, 1};
sort(arr)

// При чтении лог-файла получим:
2023-05-19 07:53 [4, 8, 3, 1, 9]
2023-05-19 07:53 [4, 3, 1, 8, 9]
2023-05-19 07:53 [3, 1, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9] 
 */
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalTime;
import java.time.LocalDate;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) throws IOException {
      PrintWriter writer = new PrintWriter("log.txt");
      writer.write("");
      writer.close();
      int temp = 0;
      fileWriter = new FileWriter("log.txt", true);   
      boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    temp = mas[j + 1];
                    mas[j + 1] = mas[j];
                    mas[j] = temp;
                    isSorted = false;
                }
            }
            fileWriter.write(LocalDate.now().toString() + " ");
                int nowMinute = LocalTime.now().getMinute();
                if (nowMinute >= 0 && nowMinute < 10) {
                    fileWriter.write("0"+LocalTime.now().getHour() + ":" + "0" + nowMinute + " ");
                } else {
                    fileWriter.write("0"+LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + " ");
                }
                fileWriter.write(Arrays.toString(mas) + "\n");
        }
        fileWriter.close();
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2{ 
    public static void main(String[] args) throws IOException { 
      int[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new int[]{9, 4, 8, 3, 1};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      }     
      
      BubbleSort ans = new BubbleSort();      
      ans.sort(arr);

      try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
