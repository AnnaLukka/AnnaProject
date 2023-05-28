package HWLesson6;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");
        Scanner name = new Scanner(System.in);
        System.out.println("Input your name");
        String input = name.nextLine();

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(101);
        System.out.println("Random number is " + randomNumber);

        while (true) {
            System.out.println("Choose any number from 0-100");
            int inputNumber = scanner.nextInt();

            if (inputNumber == randomNumber) {
                System.out.println("Congratulations, " + input + "!");
                break;

            } else if (randomNumber < inputNumber) {
                System.out.println("Your number is too big. Please, try again.");

            } else if (randomNumber > inputNumber) {
                System.out.println("Your number is too small. Please, try again.");
            }

        }


    }
}

