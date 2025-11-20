package by.vadarod.practice_task2;

public class Task2_9 {
    public static void main(String[] args) {
        //9. Создать массив чисел от 1 до 100. Вывести полученный массив
        int[] arr = new int[100];
        //int result = 0;

        for(int i = 1; i <= arr.length-1; i++){
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }

    }
}
