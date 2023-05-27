package HWLesson5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        String result = String.valueOf(0);

        while (true) {
            System.out.println("Введите рандомные слова любого колличества");
            String input = text.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            result = result + (input);
            System.out.println(result);

        }
    }
}