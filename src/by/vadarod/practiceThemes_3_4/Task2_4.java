package by.vadarod.practice_task2;

public class Task2_4 {
    public static void main(String[] args) {
        //4. Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой (while)
        int i = 100;

        while (i > 1){
            System.out.print(i);
            System.out.print(", ");
            i--;
        }
        System.out.print("1");
    }
}
