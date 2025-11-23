package by.vadarod.practiceThemes15_16.ReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MainReaderWriter {
    public static void main(String[] args) {
        String str = "Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.";
        String absolutePath = "L:\\Java_Core\\files\\";
        String relativePath = "testfolder\\";
        String fileAbsolute = "fileAbsolute.txt";
        String fileRelative = "fileNotAbsolute.txt";
        write1(str, absolutePath, fileAbsolute);
        read1(absolutePath, fileAbsolute);
        write2(str, relativePath, fileRelative);
        read2(relativePath, fileRelative);
    }

    private static void write1(String str, String path, String nameOfFile) {

        File file = new File(path, nameOfFile);
        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(str);
        }catch (Exception e){
            throw new RuntimeException("Ошибка");
        }
    }

    private static void read1(String path, String nameOfFile) {
        File file = new File(path + nameOfFile);
        try (FileReader fileReader = new FileReader(file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            System.out.println(text);
        }catch (Exception e){
            throw new RuntimeException("Ошибка");
        }
    }

    private static void write2(String str, String path, String nameOfFile) {

        File file = new File(path, nameOfFile);
        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(str);
        }catch (Exception e){
            throw new RuntimeException("Ошибка");
        }
    }

    private static void read2(String path, String nameOfFile) {
        File file = new File(path + nameOfFile);
        try (FileReader fileReader = new FileReader(file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            System.out.println(text);
        }catch (Exception e){
            throw new RuntimeException("Ошибка");
        }
    }

}
/*
Дан русский текст: Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов "живых" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.
Использовать Reader, Writer
1. Записать его в файл прописал относительный путь.
2. Записать его в файл прописав абсолютный путь.
3. Вычитать текст из первого файла.
4. Вычитать текст из второго файла
5. Создать объект Ферма с полями. Выполнить сериализацию и десериализацию в файл. (интерфейс Externelizibel)
 */