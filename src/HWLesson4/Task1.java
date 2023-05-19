package HWLesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ведите ваш текст");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        String s4 = input.next();

        System.out.printf("Ваш введенный текст: " + s1 + "\n");
        System.out.printf("Ваш введенный текст: " + s2 + "\n");
        System.out.printf("Ваш введенный текст: " + s3 + "\n");
        System.out.printf("Ваш введенный текст: " + s4 + " " + input.next() + " " + input.next());


    }
}
