package by.vadarod.practice_task2;

public class Task2_6 {
    public static void main(String[] args) {
        //6. Вывести только нечётные числа от 1 до 100
        int i;

        for(i = 1; i <= 100; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
