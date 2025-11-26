package by.vadarod.practiceThemes17_18.FermaCollectionVoid;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainFermaList {
    public static void main(String[] args) {
        String nameOfFile = "FileSerialized";
        serialize(nameOfFile);
        deserialize(nameOfFile);
        deserialize2(nameOfFile);
    }

    public static void serialize(String nameOfFile){

        //Создание объектов типа Ferma (класс Ferma дожен реализовывать интерфейс Serializable)
        Ferma ferma1 = new Ferma("Ferma1", 10);
        Ferma ferma2 = new Ferma("Ferma2", 20);

        //Создание коллекции типа Ferma и добавление в нее объектов (ферм)
        List<Ferma> ferms =  new ArrayList();
//        List<Ferma> ferms =  new LinkedList<>();
        ferms.add(ferma1);
        ferms.add(ferma2);

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

    //Метод десериализации коллекции c приведением к интерфейсу List: гибкость (изменение сериализованного списка, напр. на LinkedList, метод работает)
    public static void deserialize(String nameOfFile){

        // new FileInputStream(nameOfFile) — открываем байтовый поток для чтения данных из файла.
        // new ObjectInputStream(...) — создаём поток высокого уровня для десериализации объектов (сама десериализация ещё НЕ выполняется)
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nameOfFile))) {
            // Десериализация объекта: readObject() читает бинарные данные, ранее записанные writeObject(),
            // восстанавливает объект и возвращает его как Object. Поэтому требуется приведение типов к List<Ferma>.
            List<Ferma> fermaList = (List<Ferma>) objectInputStream.readObject();
            System.out.println("Коллекция по элементам: " + fermaList.get(0) + " и " + fermaList.get(1));
            System.out.println("Вся коллекция: " + fermaList);
        }catch (IOException e) {// Если файл отсутствует или недоступен
            throw new RuntimeException(e);//Выкидываем исходное исключение в RuntimeException, чтобы не скрывать информацию об ошибке
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //Метод десериализации коллекции c приведением к интерфейсу ArrayList: жесткое приведение (изменение сериализованного списка, напр. на LinkedList, метод не будет работать). Демонстрация ClassCastException
    public static void deserialize2(String nameOfFile){

        // new FileInputStream(nameOfFile) — открываем байтовый поток для чтения данных из файла.
        // new ObjectInputStream(...) — создаём поток высокого уровня для десериализации объектов (сама десериализация ещё НЕ выполняется)
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nameOfFile))) {
            // Десериализация объекта: readObject() читает бинарные данные, ранее записанные writeObject(),
            // восстанавливает объект и возвращает его как Object. Поэтому требуется приведение типов к List<Ferma>.
            ArrayList<Ferma> fermaArrayList = (ArrayList<Ferma>) objectInputStream.readObject();
            System.out.println("Коллекция по элементам: " + fermaArrayList.get(0) + " и " + fermaArrayList.get(1));
            System.out.println("Вся коллекция: " + fermaArrayList);
        }catch (IOException e) {// Если файл отсутствует или недоступен
            throw new RuntimeException(e);//Выкидываем исходное исключение в RuntimeException, чтобы не скрывать информацию об ошибке
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
