package by.vadarod.practice_task2;

public class Task2_3 {
    public static void main(String[] args) {
        //3. Написать программу, которая посчитает сумму первых 10 чисел
        int[] arr = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
        int sum  = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum );


    }
}
