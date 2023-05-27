package HWLesson5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int metall = 0;
        while (metall <= 1000) {
            if ((1000 - metall) == 0) {
                break;
            }
            System.out.println("Введите количество металла для хранения");
            int inputMetall = in.nextInt();
            if (inputMetall < 5) {
                System.out.println("Невозможно принять такое количество веса, минимальное количество: 5");
                System.out.println("Осталось места на " + (1000 - metall));
                continue;
            }
            if ((metall + inputMetall) > 1000) {
                System.out.println("На данный момент такое количество металла у нас не поместится");
                System.out.println("Осталось места на " + (1000 - metall));
                continue;
            }
            if ((1000 - (metall + inputMetall)) > 0 && (1000 - (metall + inputMetall)) <= 5) {
                System.out.println("После вашей сдачи металла будет маленький остаток места на складе");
                System.out.println("Осталось места на складе" + (1000 - metall));
                continue;
            }
            metall = metall + inputMetall;
            System.out.println("Осталось места на складе" + (1000 - metall));

        }

    }
}


