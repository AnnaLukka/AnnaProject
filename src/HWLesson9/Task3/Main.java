package HWLesson9.Task3;

public class Main {

    public static void main(String[] args) {
        Converter converter = new Converter("Converter");
        int x = converter.convertToInt('f');
        int a = converter.convertToInt(false);
        System.out.println(x);
        System.out.println(a);
    }
}

