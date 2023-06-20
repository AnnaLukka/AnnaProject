package HWLesson9.Task1;

public class Equals {

    public static void main(String[] args) {
        Computer macBook = new Computer("Macbook", 8, 1000, 250);
        Computer macBook2 = new Computer("MacBook", 8, 900, 250);
        System.out.println(macBook.equals(macBook2));

        System.out.println(macBook.hashCode());
        System.out.println(macBook2.hashCode());
    }
}


