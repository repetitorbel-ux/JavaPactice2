package by.vadarod.practice_task5_1;

public class Refregirator implements Device, KitchenDevice{
    private String name;
    private String marka;
    private int price;
    private boolean isOn;

    @Override
    public void work(){
        System.out.println("Холодильник морозит");
    }

    public Refregirator(String name, String marka, int price, boolean isOn) {
        this.name = name;
        this.marka = marka;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void broken() {
        System.out.println("Холодильник ломается");
    }
}
/*
4. Создать класс Холодильник. Поля: наименование, марка, стоимость, Boolean isOn (включен). Класс холодильник имплементирует интерфейс Электроприборы. Переопределите метод work так, чтобы методы выводил «Холодильник морозит».
 */