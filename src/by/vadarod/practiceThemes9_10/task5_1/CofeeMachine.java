package by.vadarod.practice_task5_1;

public class CofeeMachine implements Device{
    private String name;
    private String function;
    private int price;
    private boolean isOn;

    @Override
    public void work(){
        System.out.println("Кофемашина" + name +  "варит кофе");
    }

    public CofeeMachine(String name, String function, int price, boolean isOn) {
        this.name = name;
        this.function = function;
        this.price = price;
        this.isOn = isOn;
    }

    public void makeCapuchino(){
        System.out.println("Кофемашина " + name + " вариант капучино");
    }

    public void start(){
        isOn = true;
        System.out.println("Кофемашина стартует " + isOn);
    }


}
/*
3. Создать класс Кофемашина. Поля наименование. Список функционала. Стоимость, Boolean isOn (включен) Класс кофемашина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».
На любой кофемашине вызовете метод start(). После этого переопределите метод start так, чтобы этот метод включал прибор (менял значение Boolean isOn на true.) Выведите результат в консоль
 */