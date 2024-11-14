package org.example.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3],
 * и представляют собой, например, состояния ячеек поля для игры в крестикинолики,
 * где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3 –
 * резервное значение. Такое предположение позволит хранить в одном числе типа int
 * всё поле 3х3.
 * Записать в файл 9 значений так, чтобы они заняли три байта.
 * Прочитать числа из файла, полученного в результате выполнения задания.
 */
public class Program {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 3, 2, 1, 0, 3};

        try (FileOutputStream fileOutputStream = new FileOutputStream("game.out")) {
            for (int i = 0; i< 3; i++) {
                byte bt = 0;
                for (int j = 0; j < 3; j++) {
                    bt += (byte) (arr[3 * i + j] << (j * 2));
                }
                fileOutputStream.write(bt);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        int[] arr2 = new int[9];
        int x;
        int i = 0;
        try(FileInputStream fileInputStream = new FileInputStream("game.out")){
            while((x = fileInputStream.read()) != -1){
                for (int j = 0; j < 3; j++) {
                    arr2[i++] = x >> (j * 2) & 0x3;
                }
            }
            fileInputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(arr2));
    }
}
