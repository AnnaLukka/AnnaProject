package HWLesson8;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(" Четные числа в массиве: " + a[i]);
            }

            if (a[i] % 2 != 0) {
                System.out.println(" Нечетные числа в массиве: " + a[i]);
            }
        }

    }

}

