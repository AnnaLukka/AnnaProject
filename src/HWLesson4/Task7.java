package HWLesson4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите вашу ОС: MacOS/ Windows/ LiNux");
        String os = in.nextLine();
        String program;
        switch (os.toUpperCase()) {
            case ("LINUX"):
                System.out.println("Какую программу вы хотите скачать: IntelliJ IDEA/ Git/ Java?");
                program = in.nextLine();
                switch (program.toLowerCase()) {
                    case ("intelliJ"):
                        System.out.println("Вот ваша ссылка на скачивание для Linux: https://www.jetbrains.com/idea/");
                        break;
                    case ("git"):
                        System.out.println("Вот ваша ссылка на скачивание для Linux: https://github.com/");
                        break;
                    case ("java"):
                        System.out.println("Вот ваша ссылка на скачивание для Linux: https://www.oracle.com/cis/java/technologies/downloads/");
                        break;
                    default:
                        System.out.println("Увы, такой программы нет");
                }
                break;
            case ("MACOS"):
                System.out.println("Какую программу вы хотите скачать: IntelliJ IDEA/ Git/ Java?");
                program = in.nextLine();
                switch (program.toLowerCase()) {
                    case ("intelliJ"):
                        System.out.println("Вот ваша ссылка на скачивание для MacOS: https://www.jetbrains.com/idea/");
                        break;
                    case ("git"):
                        System.out.println("Вот ваша ссылка на скачивание для MacOS: https://github.com/");
                        break;
                    case ("java"):
                        System.out.println("Вот ваша ссылка на скачивание для MacOS: https://www.oracle.com/cis/java/technologies/downloads/");
                        break;
                    default:
                        System.out.println("Увы, такой программы нет");
                }
                break;
            case ("WINDOWS"):
                System.out.println("Какую программу вы хотите скачать: IntelliJ IDEA/ Git/ Java?");
                program = in.nextLine();
                switch (program.toLowerCase()) {
                    case ("intelliJ"):
                        System.out.println("Вот ваша ссылка на скачивание для Windows: https://www.jetbrains.com/idea/");
                        break;
                    case ("git"):
                        System.out.println("Вот ваша ссылка на скачивание для Windows: https://github.com/");
                        break;
                    case ("java"):
                        System.out.println("Вот ваша ссылка на скачивание для Windows: https://www.oracle.com/cis/java/technologies/downloads/");
                        break;
                    default:
                        System.out.println("Увы, такой программы нет");
                }
                break;
            default:
                System.out.println("Такой ОС не найдено");
        }

    }

}
