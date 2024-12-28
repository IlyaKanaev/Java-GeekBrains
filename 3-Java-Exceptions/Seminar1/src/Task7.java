/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */
public class Task7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] otherArr = {4, 5, 6};
        for (int i: sumElementsArray(arr, otherArr))
            System.out.print(i + " ");

        //sumElementsArray(null, null);
        int[] arr1 = {1, 2, 3};
        int[] otherArr1 = {4, 5};
        sumElementsArray(arr1, otherArr1);
    }

    public static int[] sumElementsArray(int[] firstArray, int[] secondArray){
        if (firstArray == null || secondArray == null)
            throw new RuntimeException("Один из массивов пустой!");
        if (firstArray.length != secondArray.length)
            throw new RuntimeException("Длины массивов не равна!");
        int[] resultArray = new int[secondArray.length];
        for (int i = 0; i < firstArray.length; i++){
            resultArray[i] = firstArray[i] + secondArray[i];
        }
        return resultArray;
    }
}
