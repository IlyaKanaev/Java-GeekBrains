package Homework3;
/*
 * Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, реализует алгоритм сортировки слиянием

Метод должен возвращать отсортированный массив. Пример:

a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
 */
class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
    if (a.length <= 1) {
      return a;
    }
    
    // Находим середину массива
    int mid = a.length / 2;
    
    // Разделяем массив на две половины
    int[] left = new int[mid];
    int[] right = new int[a.length - mid];
    System.arraycopy(a, 0, left, 0, left.length);
    System.arraycopy(a, mid, right, 0, right.length);
    
    // Рекурсивно сортируем каждую половину
    mergeSort(left);
    mergeSort(right);
    
    // Сливаем две отсортированные половины в одну
    merge(a, left, right);
    
    return a;
  }
  
  private static void merge(int[] a, int[] left, int[] right) {
    int i = 0, j = 0, k = 0;
    
    // Сравниваем элементы в двух половинах и помещаем их в итоговый массив в порядке возрастания
    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        a[k++] = left[i++];
      } else {
        a[k++] = right[j++];
      }
    }
    
    // Копируем оставшиеся элементы из левой половины (если есть)
    while (i < left.length) {
      a[k++] = left[i++];
    }
    
    // Копируем оставшиеся элементы из правой половины (если есть)
    while (j < right.length) {
      a[k++] = right[j++];
    }
    }
}