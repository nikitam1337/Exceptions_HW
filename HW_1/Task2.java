package HomeWork.HW_1;

public class Task2 {
    public static void main(String[] args) {
        
    }
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? 
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    /*
     * 1) Строка 10 - arr.length - может привести к NullPointerException;
     * 2) Строка 11 - j<5 - может привести к : ArrayIndexOutOfBoundsException;
     * 3) Строка 12 - Integer.parseInt - может привести к : NumberFormatException;
     */

}
