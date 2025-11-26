package by.vadarod.practiceTheme_19_20;

import java.util.List;
import java.util.concurrent.Callable;

public class NumberGenerator implements Callable<String> {
    private List<Integer>numbers;
    private String name;

    @Override
    public String call() throws Exception {
//        System.out.println((Thread.currentThread().getName() + name + " start"));
        System.out.println(( name + " start"));
        int result = numbers.stream().mapToInt(number -> number).sum();
        Thread.sleep(10000);
        System.out.println(name + " " + result);
        return String.valueOf(result);
    }

    public NumberGenerator(List<Integer> numbers, String name) {
        this.numbers = numbers;
        this.name = name;
    }

    public NumberGenerator(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
/*
Задание №3
Создать задачу Callable, которая генерирует коллекцию из 10 НЕрандомных целых чисел -> засыпает произвольно на 1-10 секунд, результат выполнения – сумму этих чисел в виде строки. Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу.
 */