package by.vadarod.practice_task1;
import java.util.Scanner;

public class Task1_7 {
    public static void main(String[] args) {
        //3. На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.
        Scanner in=new Scanner(System.in);
        System.out.print("Введите число а: ");
        float a = in.nextFloat();

        if ((float)a % (float)3 == 0) {
            System.out.print("Число а = " + (float)a + " делиться на 3");
        } else {
            System.out.print("Число а = " + (float)a + " не делиться на 3");
        }
    }
}
/*Хотел, чтобы и с вещественными работало, но дает ошибку
Введите число а: 10.5
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextFloat(Scanner.java:2496)
	at by.vadarod.practice_task1.Task1_7.main(Task1_7.java:10)
	Посмотрел эти методы, указывает на Exception, но что-то не понял почему
*/