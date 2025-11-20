package by.vadarod.practice_task1;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        //4. Введите x,y,z. К числу x прибавьте y, число y умножьте на z. Используйте операции присваивания.
        // Результат выведите в косноль

        Scanner in=new Scanner(System.in);
        System.out.print("Введите х: ");
        int x = in.nextInt();

        System.out.print("Введите y: ");
        int y = in.nextInt();

        System.out.print("Введите z: ");
        int z = in.nextInt();

        x+=y;
        y*=z;
        System.out.println("x + y = " + x + "  " + "y + z = " + z);
    }
}
