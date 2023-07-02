package HomeWork.HW_1;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращает новый массив, каждый элемент которого равен разности элементов двух 
// входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = { 12, 5, 8, 10, 3 };
        int[] arr2 = { 5, 6, 1, 4, 2 };
        if (arr1.length != arr2.length) {
            System.out.println("Длины массивов не равны");
        } else {
            printArray(difference(arr1, arr2));
        }

    }

    public static int[] difference(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.print("]");
    }

}
