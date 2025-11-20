package by.vadarod.practice_task5_1;

public class WashingMachine implements Device, KitchenDevice{
    private String name;
    private String brend;
    private int price;
    private boolean isOn;

    @Override
    public void work(){
        System.out.println("Стиральная машина стирает");
    }

    public WashingMachine(String name, String brend, int price, boolean isOn) {
        this.name = name;
        this.brend = brend;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void broken() {
        System.out.println("Стиралка ломается");
    }
}
/*
5. Создать класс Стиральная машина. Поля наименование, бренд, стоимость, Boolean isOn. Класс стиральная машина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».
 */