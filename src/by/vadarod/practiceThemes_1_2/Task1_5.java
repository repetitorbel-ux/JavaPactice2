package by.vadarod.practice_task1;
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        //1. Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную.
        // Иначе если a=b  вывести сумму этих чисел.
        //Иначе, вывести разность b-a. Результат вычисления передать в новую переменную.

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
        //2. Ввести числа a и b с консоли. Если a>b и b не равно 0-вывести результат деления a на b.
        //Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.
        if ((a > b) & (b != 0)) {
            System.out.println("a / b = " + (float)((float)a / (float)b));
        } else if (a != 0) {
            System.out.println("b / a = " + (float)((float)b + (float)a));
        } else {
            System.out.println("a + b = " + (a + b));
        }
    }
}
