package by.vadarod.practice_task4;

public class ApartmentBuilding extends CivilBuilding{
//1.5 Создать класс Многоквартирный жилой дом. Вопрос: От какого класса должен наследоваться Многоквартирный жилой дом. Поля, которые можно определить в Многоквартирном жилье: количество квартир.
    private int numberOfFlat;

    //Конструктор подкласса (с полями-параметрами суперсуперкласса и своего суперкласса)
    public ApartmentBuilding(String address, String materialOfWall, int year, String purpose, int numberOfFloors, int numberOfFlat) {
        super(address, materialOfWall, year, purpose, numberOfFloors);
        this.numberOfFlat = numberOfFlat;
    }

    public String info(){
        String result = super.info() + "Количество этажей: " + numberOfFlat;
        return result;
    }
}
