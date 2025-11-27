package by.vadarod.practiceTheme_19_20;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainColable {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(2,4,6,9);
        List<Integer> list2 = List.of(3,5,8,9);
        List<Integer> list3 = List.of(23,14,26,39);
        List<Integer> list4 = List.of(3,17,2,3);

        NumberGenerator num1 = new NumberGenerator(list1, "first");
        NumberGenerator num2 = new NumberGenerator(list2, "second");
        NumberGenerator num3 = new NumberGenerator(list3, "third");
        NumberGenerator num4 = new NumberGenerator(list4, "4-q");

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> future1 = executorService.submit(num1);
        Future<String> future2 = executorService.submit(num2);
        Future<String> future3 = executorService.submit(num3);
        Future<String> future4 = executorService.submit(num4);

//        try {
//            future1.get();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }


    }
}
/*
Задание №3
Создать задачу Callable, которая генерирует коллекцию из 10 НЕрандомных целых чисел -> засыпает произвольно на 1-10 секунд, результат выполнения – сумму этих чисел в виде строки. Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу.
 */