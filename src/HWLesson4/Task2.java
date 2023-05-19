package HWLesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner side = new Scanner(System.in);
        System.out.println(" Введите длину стороны треугольника");
        int a = side.nextInt();
        System.out.println(" Введите длину стороны треугольника");
        int b = side.nextInt();
        System.out.println(" Введите длину стороны треугольника");
        int c = side.nextInt();
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println(" Из этих данных треугольник получится");
        } else {
            System.out.println(" Из этих данных треугольник построить нельзя");
        }


    }
}

