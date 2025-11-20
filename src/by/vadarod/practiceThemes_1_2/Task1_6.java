package by.vadarod.practice_task1;
import java.util.Scanner;

public class Task1_6 {
    public static void main(String[] args) {
        //2. Ввести числа a и b с консоли. Если a>b и b не равно 0-вывести результат деления a на b.
        //Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.

        Scanner in=new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();

        if (a > b){
            int c = a - b;
            System.out.println("a - b = " + c);
        } else if (a == b) {
            System.out.println("a + b = " + (a + b));
        } else {
            System.out.println("b - a = " + (b - a));
        }
    }
}
