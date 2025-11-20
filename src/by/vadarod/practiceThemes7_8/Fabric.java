package by.vadarod.practice_task4;

public class Fabric extends IndustrialBuilding{
//1.6 Создать класс фабрика. Вопрос: От какого класса должна наследоваться Фабрика. Поля, которые можно определить в Фабрике: количество работников, выпускаемая продукция (запчасти, полиэтилен и т.д.)
    private int numberOfWorkers;
    private String goods;

    //Конструктор подкласса (с полями-параметрами суперсуперкласса и своего суперкласса)
    public Fabric(String address, String materialOfWall, int year, String sector, int numberOfWorkers, String goods) {
        super(address, materialOfWall, year, sector);
        this.numberOfWorkers = numberOfWorkers;
        this.goods = goods;
    }

    public String info(){
        String result = super.info() + "Количество работников: " + numberOfWorkers + "Выпускаемая продукция: " + goods;
        return result;
    }




}
