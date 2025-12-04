package by.vadarod.practiceTheme_19_20;

public class Main {
    public static void main(String[] args) {
        Multi multi = (int a, int b) -> {
            return a * b; //Возвращает число 15
        };

        int m = multi.multiplication(5, 10);
        System.out.println(m);

        hello(multi, 5, 10);

        Multi divide = (int a, int b) -> {
            return a / b; //Возвращает число 15
        };

        int d = divide.multiplication(5, 10);
        System.out.println(d);

        hello(divide, 5, 10);

        Multi add = (int a, int b) -> {
            System.out.println(a + "; " + b);
            return a + b; //Возвращает число 15
        };

        int a = add.multiplication(5, 10);
        System.out.println(a);



    }

private static void hello(Multi multi, Integer a, int b) {
        multi.multiplication(a, b);


}



}
/*
Задание №1
1. Создать функциональный интерфейс. В этом интерфейсе будет метод, который будет возвращать результат умножения двух чисел.
Наименование метода: Integer multiplication(int a, int b);
2. В классе main используя ваш функциональный интерфейс, создате лямбда выражение и посчитайте произведение 5 на 10.
3. Результат выведите в консоль.
 */
