package by.vadarod.practice_task4;

public class Building{
    //1.1 Создать класс Постройка (Building). Поля у класса Постройка: улица, материал стен, год постройки.
    private String address;
    private String materialOfWall;
    private int year;

    //Конструктор суперкласса
    public Building(String address, String materialOfWall, int year) {
        this.address = address;
        this.materialOfWall = materialOfWall;
        this.year = year;
    }

    public String info(){
        String result = "Адрес постройки: " + address + "Материал стен: " + materialOfWall + "Год постройки: " + year;
        return result;
    }

    //Метод (вспомогательный) для подсчета количества промышленных зданий
    public boolean isIndustrial(){
        return false; // По умолчанию здание не промышленное
    }
}
