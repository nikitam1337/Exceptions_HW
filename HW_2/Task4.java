package HomeWork.HW_2;

import java.util.Scanner;

/*
 * Разработайте программу, которая выбросит Exception, 
 * когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task4 {
    public static void main(String[] args) {
        try {
            nameMethod();
        } catch (Exception e) {
            System.err.println("Пустые строки вводить нельзя!!! Перезапустите программу.");
        }
    }

    public static void nameMethod() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любые значения и нажмите ENTER");
        String input = scanner.nextLine();
        if (input.length() == 0) throw new RuntimeException();
        else{
            System.out.println(input);
        }
        scanner.close();
    }
}
