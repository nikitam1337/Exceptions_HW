package HomeWork.HW_2;

import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getFloatNubmer());
    }

    public static float getFloatNubmer() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.println("Введите дробное число (типа float)");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.err.println("Введено не дробное число!");
            }
        }
    }
}
