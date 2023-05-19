package HWLesson4;

import java.util.Date;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год своего рождения");
        int yearOfBirth = in.nextInt();
        Date date = new Date();
        String actualYear = String.format("%tY", date);
        int actualYearInt = Integer.parseInt(actualYear);
        System.out.println("Ваш возраст: " + (actualYearInt - yearOfBirth));


    }
}
