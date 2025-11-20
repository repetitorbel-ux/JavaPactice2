package by.vadarod.practice_task5_1;

public class Vacuum implements Device{
    private String name;
    private String brend;
    private int price;
    private boolean isOn;

    @Override
    public void work(){
        System.out.println("Пылесос убирает");
    }

    public Vacuum(String name, String brend, int price, boolean isOn) {
        this.name = name;
        this.brend = brend;
        this.price = price;
        this.isOn = isOn;
    }
}
/*
6. Создать класс Пылесос. Поля наименование, бренд, стоимость, Boolean isOn. Класс Пылесос имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает».
 */