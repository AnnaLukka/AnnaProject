package HWLesson8;

public class Task3 {
    /*3)  Создать класс Конспект. Класс должен содержать следующие поля:
        Название предмета;
        ФИО студента;
        Количество страниц;
        Год выпуска;
        Цвет обложки.
        Название заведения, где учится студент;*/
    public static void main(String[] args) {
        Task3Outline mathematics = new Task3Outline();
        mathematics.courseName = "Mathematics";
        mathematics.studentName = "AnnaLukashenko";
        mathematics.pageCount = 150;
        mathematics.yearOfIssue = 2023;
        mathematics.coverColour = "blue";
        mathematics.nameOfInstitution = "DanIT";

        System.out.println(mathematics.courseName);
        System.out.println(mathematics.studentName);
        System.out.println(mathematics.pageCount);
        System.out.println(mathematics.yearOfIssue);
        System.out.println(mathematics.coverColour);
        System.out.println(mathematics.nameOfInstitution);


    }
}



