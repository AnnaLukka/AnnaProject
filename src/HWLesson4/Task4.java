package HWLesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Число X больше Y, и это True/False. Введите два числа, проверим!");
        int x = in.nextInt();
        int y = in.nextInt();
        if (x > y) {
            System.out.print("Да, действительно " + x);
            System.out.print(" больше " + y);
            boolean z = x > y;
            System.out.println(". И это " + z);

        } else if (x < y) {
            System.out.print("Число " + x);
            System.out.print(" больше " + y);
            boolean z = x > y;
            System.out.println(". И это " + z);
        } else {
            System.out.print("Эти числа равны");
            boolean z = x == y;
            System.out.println(". И это " + z);
        }


    }
}
