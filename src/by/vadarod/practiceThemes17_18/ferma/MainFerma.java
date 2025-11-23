package by.vadarod.practiceThemes17_18.ferma;

import java.io.*;

public class MainFerma {
    public static void main(String[] args) {

        String nameOfFile = "FileSerialized";
//        serialize(nameOfFile);
        serialize2(nameOfFile);
        deserialize(nameOfFile);
        deserialize2(nameOfFile);
        deserialize3(nameOfFile);
    }

    //Метод сериализации без закрытия потоков (технически работает, но так писать нельзя в реальных проектах)
    public static void serialize(String nameOfFile){
        Ferma ferma1 = new Ferma("Ferma1", 10);
        Ferma ferma2 = new Ferma("Ferma2", 20);
        /*Создание потоков для сериализации объектов:
        1) Потока для записи байтов в файл (FileOutputStream),
        2) Потока, преобразовывающего Java-объекты в последовательность байтов (ObjectOutputStream — сериализация). */
        try {
            // Подготовка к записи: открываем/создаём файл nameOfFile.
            // Запись на этом этапе ЕЩЁ не происходит — FileOutputStream только готов принимать байты.
            // ВАЖНО: если файл уже существовал, его содержимое будет ПОЛНОСТЬЮ перезаписано.
            FileOutputStream fileOutputStream = new FileOutputStream(nameOfFile);
            // Создаём поток для сериализации объектов (на этом шаге сериализация ещё НЕ выполняется).
            // При вызове writeObject() этот поток преобразует объект в байты и передаёт их в FileOutputStream через ссылку fileOutputStream.
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //Сериализация и запись объектов: writeObject() одновременно превращает объект в набор байтов и передаёт эти байты во внутренний FileOutputStream, который физически записывает их в файл
            objectOutputStream.writeObject(ferma1);
            objectOutputStream.writeObject(ferma2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Метод сериализации с закрытием потока записи в файл
    public static void serialize2(String nameOfFile){

        //Создание объектов типа Ferma (класс Ferma дожен реализовывать интерфейс Serializable)
        Ferma ferma1 = new Ferma("Ferma1", 10);
        Ferma ferma2 = new Ferma("Ferma2", 20);

        //Выносим объявление переменной за блок try, чтобы она была доступна в блоке finally
        ObjectOutputStream objectOutputStream = null;

        /*Создание потоков для сериализации объектов:
        1) Потока для записи байтов в файл (FileOutputStream),
        2) Потока, преобразовывающего Java-объекты в последовательность байтов (ObjectOutputStream — сериализация). */
        try {
            // Подготовка к записи: открываем/создаём файл nameOfFile.
            // Запись на этом этапе ЕЩЁ не происходит — FileOutputStream (через fileOutputStream) только готов принимать байты.
            // ВАЖНО: если файл уже существовал, его содержимое будет ПОЛНОСТЬЮ перезаписано.
            FileOutputStream fileOutputStream = new FileOutputStream(nameOfFile);
            // Создаём поток для сериализации объектов (на этом шаге сериализация ещё НЕ выполняется).
            // При вызове writeObject() этот поток преобразует объект в байты и передаёт их в FileOutputStream через ссылку fileOutputStream.
             objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //Сериализация и запись объектов: writeObject() одновременно превращает объект в набор байтов и передаёт эти байты во внутренний FileOutputStream, который физически записывает их в файл
            objectOutputStream.writeObject(ferma1);
            objectOutputStream.writeObject(ferma2);
        } catch (IOException e) { // Обрабатываем все возможные ошибки ввода-вывода
            throw new RuntimeException(e); //Выкидываем исходное исключение в RuntimeException
        }
        //Закрываем именно "верхний" поток, а он автоматически закрывает внутренний fileOutputStream
        finally {
            try {
                if(objectOutputStream  != null){
                    objectOutputStream .close();
                }
            }catch (IOException e){
                //оставим без обработки
            }
        }
    }

    public static void deserialize(String nameOfFile){
        //Выносим объявление переменной за блок try, чтобы она была доступна в блоке finally
        ObjectInputStream objectInputStream = null;

        /*Создание потоков для десериализации объектов:
        1) Потока FileInputStream для чтения байтов из файла,
        2) Потока ObjectInputStream, который преобразует байты обратно в объект (десериализация)*/
        try {
            // Подготовка к чтению: открываем файл по имени nameOfFile.
            FileInputStream fileInputStream = new FileInputStream(nameOfFile);
            //Создаём поток для десериализации объектов (на этом шаге десериализация ещё НЕ выполняется).
            objectInputStream = new ObjectInputStream(fileInputStream);
            //Десериализация объектов по порядку (строгое правило формата Java Serialization): читаем объекты в том же порядке, в каком они были записаны
            System.out.println(objectInputStream.readObject());
            System.out.println(objectInputStream.readObject());
        }catch (IOException e) {
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // Закрываем верхний поток — он сам закроет FileInputStream
        finally {
            try {
                if(objectInputStream != null){
                    objectInputStream.close();
                }
            }catch (IOException e){
                //оставим без обработки
            }
        }
    }

    //Метод десериализации с выносом десериализованных объектов в переменные типа Object
    public static void deserialize2(String nameOfFile){
        //Выносим объявление переменной за блок try, чтобы она была доступна в блоке finally
        ObjectInputStream objectInputStream = null;

        /*Создание потоков для десериализации объектов:
        1) Потока FileInputStream для чтения байтов из файла,
        2) Потока ObjectInputStream, который преобразует байты обратно в объект (десериализация)*/
        try {
            // Подготовка к чтению: открываем файл по имени nameOfFile.
            FileInputStream fileInputStream = new FileInputStream(nameOfFile);
            //Создаём поток для десериализации объектов (на этом шаге десериализация ещё НЕ выполняется).
            objectInputStream = new ObjectInputStream(fileInputStream);
            //Десериализация объектов по порядку (строгое правило формата Java Serialization): читаем объекты в том же порядке, в каком они были записаны
            Object object1 = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            System.out.println("Прочитан первый объект: " + object1);
            System.out.println("Прочитан второй объект: " + object2);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // Закрываем верхний поток — он сам закроет FileInputStream
        finally {
            try {
                if(objectInputStream != null){
                    objectInputStream.close();
                }
            }catch (IOException e){
                //оставим без обработки
            }
        }
    }

    //Метод десериализации с приведением типа в Ferma для получения доступа к методам Ferma
    public static void deserialize3(String nameOfFile){
        //Выносим объявление переменной за блок try, чтобы она была доступна в блоке finally
        ObjectInputStream objectInputStream = null;

        /*Создание потоков для десериализации объектов:
        1) Потока FileInputStream для чтения байтов из файла,
        2) Потока ObjectInputStream, который преобразует байты обратно в объект (десериализация)*/
        try {
            // Подготовка к чтению: открываем файл по имени nameOfFile.
            FileInputStream fileInputStream = new FileInputStream(nameOfFile);
            //Создаём поток для десериализации объектов (на этом шаге десериализация ещё НЕ выполняется).
            objectInputStream = new ObjectInputStream(fileInputStream);
            //Десериализация объектов по порядку (строгое правило формата Java Serialization): читаем объекты в том же порядке, в каком они были записаны
            Ferma ferma1 = (Ferma) objectInputStream.readObject();
            Ferma ferma2 = (Ferma) objectInputStream.readObject();
            System.out.println("Прочитан первый объект: " + ferma1);
            System.out.println("Имя первой фермы: " + ferma1.getName() + ". Количество животных в первой ферме: " + ferma1.getPigCount());
            System.out.println("Прочитан второй объект: " + ferma2);
            System.out.println("Имя второй фермы: " + ferma2.getName() + ". Количество животных во второй ферме: " + ferma2.getPigCount());
        }catch (IOException e) {
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // Закрываем верхний поток — он сам закроет FileInputStream
        finally {
            try {
                if(objectInputStream != null){
                    objectInputStream.close();
                }
            }catch (IOException e){
                //оставим без обработки
            }
        }
    }

}
