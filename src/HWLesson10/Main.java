package HWLesson10;

public class Main {
        public static void main(String[] args) {
            Human mother = new Human("Anna", "Lukashenko", 31);
            Human father = new Human("Bogdan","Lukashenko", 31);
            Human child1 = new Human("Lolita", "Lukashenko", 5);
            Family family1 = new Family(mother,father, "Lukashenko");
            Human child2 = new Human("Alexander", "Lukashenko", 2);
            Human child3 = new Human("Mila", "Lukashenko", 1);
            System.out.println(father.getFamily().getFamilyName());
            System.out.println(family1.countFamily());
            family1.addChild(child1);
            family1.addChild(child2);
            family1.addChild(child3);
            System.out.println(family1.countFamily());
            family1.deleteChild(1);
            System.out.println(child2.getFamily().getFamilyName());
            System.out.println(family1.countFamily());
        }
    }

