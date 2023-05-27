package HWLesson5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String[] names = {"Petja", "Masha", "Aljona", "Fedja", "Sasha", "Anton", "Gleb"};
        int[] time = {10, 12, 14, 16, 18, 20};
        String[] places = {"School", "Shop", "Church", "Gym", "Cinema", "Clinic"};
        Scanner input = new Scanner(System.in);
        int index1;
        while (true) {
            System.out.println("Insert index of 1st array");
            System.out.println("Between 0 and " + (names.length -1));
            int index = input.nextInt();
            if (index > 0 && index < names.length) {
                index1 = index;
                break;
            }
        }
        int index2;
        while (true) {
            System.out.println("Insert index of 2st array");
            System.out.println("Between 0 and " + (time.length -1));
            int index = input.nextInt();
            int length = time.length;
            if (index >0 && index < time.length) {
                index2 = index;
                break;
            }
        }
        int index3;
        while (true) {
            System.out.println("Insert index of 3st array");
            System.out.println("Between 0 and " + (places.length -1));
            int index = input.nextInt();
            if (index > 0 && index < places.length) {
                index3 = index;
                break;
            }
        }
        System.out.println(names[index1] + " will go at " + time [index2] + ":00 to " +places [index3]);
    }
}

