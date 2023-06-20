package HWLesson9.Task1;

public class Computer1 {
    public static void main(String[] args) {
        Computer macBook = new Computer("Macbook", 8, 1000, 250);
        System.out.println("Марка компьютера: " + macBook.getName());
        System.out.println("Цена компьютера: " + macBook.getPrice());
        System.out.println("Объем оперативной памяти: " + macBook.getMemory() + " Gb");
        System.out.println("Объем видеокарты: " + macBook.getVideoCard() + " Gb");


    }
}