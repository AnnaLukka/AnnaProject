package HWLesson9.Task4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double num1;
        double num2;
        double answer;
        char sint;

        Scanner calculator = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1 = calculator.nextDouble();
        num2 = calculator.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        sint = calculator.next().charAt(0);
        switch (sint) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
            default:
                System.out.printf("Введите корректное действие");
                return;
        }
        System.out.println("Ответ:");
        System.out.println(num1 + " " + sint + " " + num2 + " = " + answer);
        System.out.println("Введите действие снова");

        /*  дальше у меня ступор. Не понимаю как сделать цикличным процесс, и чтобы Калькулятор принимал только конкретные типы действий:*/
    }
}
