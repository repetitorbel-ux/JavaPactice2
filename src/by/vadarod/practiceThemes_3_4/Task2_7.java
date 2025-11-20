package by.vadarod.practice_task2;

public class Task2_7 {
    public static void main(String[] args) {
        //7. Вывести каждый десяток от 1 до 100
        int i;

        for(i = 1; i <= 100; i++){
            if (i % 10 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
