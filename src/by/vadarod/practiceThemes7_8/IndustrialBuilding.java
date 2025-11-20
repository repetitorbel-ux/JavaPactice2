package by.vadarod.practice_task4;

public class IndustrialBuilding extends Building{
//1.3 Создать класс Промышленном здание (IndustrialBuilding). Промышленные здания наследуются от Постройки. Поля которые можно определить в Промышленном здании: отрасль (Отрасль в которой здание задействовано (машиностроительная, легкая промышленность, целлюлозная промышленность, сельское хозяйство)
    private String sector;

    //Конструктор подкласса (с полями-параметрами своего суперкласса)
    public IndustrialBuilding(String address, String materialOfWall, int year, String sector) {
        super(address, materialOfWall, year);
        this.sector = sector;
    }

    public String info(){
        String result = super.info() + "Отрасль: " + sector;
        return result;
    }

    //Переопределенный метод для подсчета количества промышленных зданий
    @Override
    public boolean isIndustrial(){
        return true; //Здесь все здания промышленные
    }

}
