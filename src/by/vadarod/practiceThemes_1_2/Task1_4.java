package by.vadarod.practice_task1;

public class Task1_4 {
    public static void main(String[] args) {
        // 6. Даны значения: x=5; y=2; c=x*y;
        // 6.2 Расставьте операции инкремента декремента так,  чтобы после выполнения операции (c=x*y) с=10; x=6; y=1
        int x = 5, y = 2, c;

        c = x++ * y--;

        System.out.print("x = " + x + "; ");
        System.out.print("y = " + y + "; ");
        System.out.print("c = x * y = " + c);

    }
}
// ++x: x становится x+1, в выражение идёт 6. x--: в выражение идёт x, затем x-1.