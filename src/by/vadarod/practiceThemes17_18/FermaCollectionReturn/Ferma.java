package by.vadarod.practiceThemes17_18.FermaCollectionReturn;

import java.io.Serializable;

public class Ferma implements Serializable {
    private String name;
    private int pigCount;

    public Ferma(String name, int pigCount) {
        this.name = name;
        this.pigCount = pigCount;
    }

    @Override
    public String toString() {
        return "Ferma{" +
                "name='" + name + '\'' +
                ", pigCount=" + pigCount +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPigCount() {
        return pigCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPigCount(int pigCount) {
        this.pigCount = pigCount;
    }
}
/*
5. Создать объект Ферма с полями. Выполнить сериализацию  2 ферм и десериализацию в файл. (интерфейс Externelizibel)
 */