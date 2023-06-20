package HWLesson9.Task2;

public class Tree {
    public String type;
    public int height;
    public int coutOfSticks;
    public String colour;


    public Tree(int coutOfSticks, String colour) {
        this.coutOfSticks = coutOfSticks;
        this.colour = colour;
    }

    public Tree(String type) {
        this.type = type;
    }

    public Tree(int height, int coutOfSticks, String colour) {
        this.height = height;
        this.coutOfSticks = coutOfSticks;
        this.colour = colour;
    }

    public Tree(String type, int height, int coutOfSticks, String colour) {
        this.type = type;
        this.height = height;
        this.coutOfSticks = coutOfSticks;
        this.colour = colour;
    }
}

