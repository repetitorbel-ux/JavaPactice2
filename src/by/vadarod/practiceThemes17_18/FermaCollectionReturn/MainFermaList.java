package by.vadarod.practiceThemes17_18.FermaCollectionReturn;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainFermaList {
    public static void main(String[] args) {
        String nameOfFile = "FileSerialized";

        //Создание объектов типа Ferma (класс Ferma дожен реализовывать интерфейс Serializable)
        Ferma ferma1 = new Ferma("Ferma1", 10);
        Ferma ferma2 = new Ferma("Ferma2", 20);

        //Создание коллекции типа Ferma и добавление в нее объектов (ферм)
        List<Ferma> ferms =  new ArrayList();
        ferms.add(ferma1);
        ferms.add(ferma2);

        serialize(ferms, nameOfFile);
//        deserialize(nameOfFile);
        System.out.println("Коллекция по элементам: " + deserialize(nameOfFile).get(0) + deserialize(nameOfFile).get(1));
        System.out.println("Вся коллекция: " + deserialize(nameOfFile));
    }

    public static void serialize(List<Ferma> ferms, String nameOfFile){

        /*Используем конструкцию try с ресурсами, гарантирующий автоматическое закрытие потоков после завершения блока,
       даже если внутри произошла ошибка.*/

        //new FileOutputStream - открытие байтового потока к файлу nameOfFile (создание или перезапись существующего файла)-
        //new ObjectOutputStream() - создание потока высокого уровня для сериализации объектов (на этом шаге сериализация ещё НЕ выполняется).
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nameOfFile))) {
            //Сериализация и запись объектов: writeObject() одновременно превращает коллекцию в последовательность байтов и передаёт их во внутренний FileOutputStream, который физически записывает данные в файл.
            objectOutputStream.writeObject(ferms);
        } catch (IOException e) { //Обрабатываем все возможные ошибки ввода-вывода
            throw new RuntimeException(e); //Выкидываем исходное исключение в RuntimeException, чтобы не скрывать информацию об ошибке
        }
    }

    //Метод десериализации коллекции c возвратом коллекции: можно дальше работать с объектом
    public static List<Ferma> deserialize(String nameOfFile){

        // new FileInputStream(nameOfFile) — открываем байтовый поток для чтения данных из файла.
        // new ObjectInputStream(...) — создаём поток высокого уровня для десериализации объектов (сама десериализация ещё НЕ выполняется)
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nameOfFile))) {
            // Десериализация объекта: readObject() читает бинарные данные, ранее записанные writeObject(),
            // восстанавливает объект и возвращает его как Object. Поэтому требуется приведение типов к List<Ferma>.
            List<Ferma> fermaList = (List<Ferma>) objectInputStream.readObject();
            return fermaList;

        }catch (IOException e) {// Если файл отсутствует или недоступен
            throw new RuntimeException(e);//Выкидываем исходное исключение в RuntimeException, чтобы не скрывать информацию об ошибке
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}