package by.vadarod.practice_task4;

public class CivilBuilding extends Building{
//1.2 Создать класс Гражданские здания (CivilBuilding). Гражданские здания должны наследоваться от класса Постройка. Поля у класса Гражданские здания: назначение (жилье или общественные здания), количество этажей.
    private String purpose;
    private int numberOfFloors;

    //Конструктор подкласса (с полями-параметрами своего суперкласса)
    public CivilBuilding(String address, String materialOfWall, int year, String purpose, int numberOfFloors) {
        super(address, materialOfWall, year);
        this.purpose = purpose;
        this.numberOfFloors = numberOfFloors;
    }

    public String info(){
        String result = super.info() + "Назначение: " + purpose + "Количество этажей: " + numberOfFloors;
        return result;
    }

}
