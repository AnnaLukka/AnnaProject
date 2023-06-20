package HWLesson9.Task1;

import java.util.Objects;

public class Computer {
    private int memory;
    private String name;
    private int price;
    private int videoCard;

    private String type;

    public Computer(int memory, String name, int price, int videoCard, String type) {
        this.memory = memory;
        this.name = name;
        this.price = price;
        this.videoCard = videoCard;
        this.type = type;
    }

    public Computer(String name, int memory, int price, int videoCard) {
        this.name = name;
        this.videoCard = videoCard;
        this.price = price;
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String brand) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public String setVideoCard(int videoCard) {
        this.videoCard = videoCard;
        return null;
    }

    public void getInfo() {
        System.out.println("Марка комиьютера " + name);
        System.out.println("Цена компьютера " + price);
        System.out.println("Объем оперативной памяти " + memory + " Gb");
        System.out.println("Объем видеокарты " + videoCard + " Gb");

    }

    @Override
    public String toString() {
        return "Марка комиьютера " + name + "\n" +
                "Цена компьютера " + price + "\n" +
                "Объем оперативной памяти " + memory + " Gb" + "\n" +
                "Объем видеокарты " + videoCard + " Gb";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(name, computer.name) && Objects.equals(memory, computer.memory) && Objects.equals(videoCard, computer.videoCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, memory, videoCard);
    }
}


