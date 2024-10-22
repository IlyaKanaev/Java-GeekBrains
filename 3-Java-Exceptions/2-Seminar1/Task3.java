/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения:
метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
и в каждой ячейке может лежатьтолько значение 0 или 1.
Если нарушается одно из условий, метод должен вернуть код ошибки.
Программа должна корректно обработать код ошибки и вывести соответствующее сообщение пользователю.
Сравнить такой вариант обработки исключений с предыдущим.
Какое преимущество у исключений перед кодами ошибок вы можете назвать в данном случае?
 */
public class Task3 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 0, 1}, {1, 0, 1}, {1, 0, 1}};
        //sumArrayElements(arr);
        //sumArrayElements(arr1);
        System.out.println(sumArrayElements(arr2));

        sumArrayElements(null);
    }

    public static int sumArrayElements(int[][] arr) {
        int sum = 0;
        if (arr == null) {
            throw new RuntimeException("Массив пустой");
        }
        if (arr.length != arr[0].length) {
            throw new RuntimeException("Массив не квадратный");
        }
        for (int[] row : arr) {
            for (int el : row) {
                if (el != 0 && el != 1) {
                    throw new RuntimeException("Элементы не 0 и 1");
                }
                sum += el;
            }
        }
        return sum;
    }
}