package by.vadarod.practice_task4;

public class AdministrativeBuilding extends CivilBuilding{
//1.4 Создать класс Административном здание. Административное здание должно наследоваться от Гражданского здания. Поля, которые можно определить в Административном здании: назначение административного здания (офисное, кинотеатр, спортсооружение), число людей, на которое рассчитано здание.
    private String purpose;
    private int capacity;

    //Конструктор подкласса (с полями-параметрами суперсуперкласса и своего суперкласса)
    public AdministrativeBuilding(String address, String materialOfWall, int year, String purpose, int numberOfFloors, String purpose1, int capacity) {
        super(address, materialOfWall, year, purpose, numberOfFloors);
        this.purpose = purpose1;
        this.capacity = capacity;
    }

    public String info(){
        String result = super.info() + "Назначение: " + purpose + "Число людей, на которое рассчитано здание: " + capacity;
        return result;
    }
}
