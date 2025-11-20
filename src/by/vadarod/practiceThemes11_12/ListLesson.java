package by.vadarod.practice_task6;

import java.util.ArrayList;
import java.util.List;

public class ListLesson {
    public static void main(String[] args) {

        task1();//Вызов метода
        task2();//Вызов метода
    }

    public static void task1(){

        //Создание коллекции (пустой)
        List<String> notes = new ArrayList<>();

        //Наполнение коллекции
        String word1 = "Привет";
        String word2 = "Как дела";
        String word3 = "Праздник";
        String word4 = "Суфле";

        notes.add(word1);
        notes.add(word2);
        notes.add(word3);
        notes.add(word4);

        //1.3 Вывод содержимого нашего списка
        for(String s : notes){
            System.out.println(s);
        }

        //Проверка содержит ли коллекция слово Конфета
        System.out.println(notes.contains("Конфета"));

        //Подсчет количества элементов в коллекции
        System.out.println("Количество элементов в коллекции: " + notes.size());
    }

    public static void task2(){

        //Создание изменяемого списка (путем оборачивания неизменяемого List.of() с помощью ArrayList<>() )
        List<String> goods = new ArrayList<>(List.of("Товар1", "Товар2", "Товар3", "Товар4", "Товар5"));

        //Вывод списка
        printList(goods);

        //Удаление одного товара
        goods.remove("Товар3");

        //Вывод списка после удаления
        printList(goods);

    }

    //Метод, реализующий вывод
    private static void printList(List<String> o){

        for (String g : o){
            System.out.println("Товары: " + g);
        }
        System.out.println();
    }
}
/*
1. Условие
1.1 Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
1.2 Добавить пару записей (Привет, Как дела, Праздник, Суфле)
1.3	Вывести все записи.
1.4	Проверить, содержит ли коллекция слово Конфета
1.5 Посчитать количество элементов в коллекции

2. Условие:
Создайте ArrayList<String> для хранения списка покупок. Добавь в него 5 товаров.
Затем выведите весь список на экран, а после — удалите один товар по названию и снова выведите обновлённый список.
 */