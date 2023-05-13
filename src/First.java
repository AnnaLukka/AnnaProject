import javax.management.loading.MLet;

public class First {

    /*1./Создать переменную string1 = "This line that i want to cut, cause it is too long"*/
    public static void main(String[] args) {
        String text = "This line that i want to cut, cause it is too long";
        System.out.println(text);

        /* Создать строку string2 в которой должно быть помещено значение строки string1*/

        String anotherText = ". And I do it";
        System.out.println(text + anotherText);

        /*Обрезанное до "This line that i want to cut, cause"*/
        String cont = "This line that i want to cut, cause it is too long";
        int index0 = cont.indexOf("This");
        int index1 = cont.indexOf("it");
        System.out.println(cont.substring(index0, index1));


       /* Создать строку string3 на основе string2 которое будет содержать значение
        "This line that don't want to cut, cause it is perfect"*/

        String cont1 = "This line that i want to cut, cause it is too long";
        int index2 = cont.indexOf("This");
        int index3 = cont.indexOf("it");
        String text1 = "This line that i want to cut, cause it is too long";
        String anotherText1 = "perfect";
        System.out.println(cont.substring(index2, index3) + anotherText1);

        /*  Вывести на консоль каждое сообщение и его длину.*/
        int lengthOfString;
        String string = "This line that i want to cut, cause it is too long";
        lengthOfString = string.length();
        System.out.println("1-" + lengthOfString+ " symbols");

        int lengthOfString1;
        String string1 = "This line that i want to cut, cause it is too long. And I do it";
        lengthOfString1 = string1.length();
        System.out.println("2-" + lengthOfString1+ " symbols");

        int lengthOfString2;
        String string2  = "This line that i want to cut, cause";
        lengthOfString2 = string2.length();
        System.out.println("3-" + lengthOfString2 + " symbols");

        int lengthOfString3;
        String string3 = "This line that i want to cut, cause perfect";
        lengthOfString3 = string3.length();
        System.out.println("4-" + lengthOfString3 + " symbols");


    }
}
