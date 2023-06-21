package HWLesson10;


public class Human extends Pet {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private String pet;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;

    }

    private Family family;

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    void greetPet(){
        System.out.println(" Привіт, " + pet+ ".");}
    void describePet(){
        System.out.println("У мене є " + getNickname() + ", їй " + getAge() +" років, він " + getTrickLevel());


    }


}

