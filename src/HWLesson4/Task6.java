package HWLesson4;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();

        System.out.println("Введите число");
        int y = in.nextInt();

        System.out.println("Выберите любое действие с этими числами: -,+,/,%,*");
        String symbol = in.next();

        boolean s = ("qwerrty").equals("qwerty");
        boolean s2 = ("qwerty").equals("qwerty");

        int result = symbol.equals("+") ? x + y :
                symbol.equals("-") ? x - y :
                        symbol.equals("*") ? x * y :
                                symbol.equals("/") ? x / y :
                                        symbol.equals("%") ? x % y : 0;
        System.out.println(result);
    }
        }

