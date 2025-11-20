package by.vadarod.practice_task4;
//1. Класс Деревня. Деревня будет состоять из построек. К постройкам относятся промышленные здания и гражданские. К промышленным зданиям будут относится заводы и фермы. К гражданским будут относится: административные здания, жилые здания.
public class Village {

    private Building[] buildings;// Объявление массива (поля) для хранения построек (пока это просто "название" для будущего массива-объекта)
    private int count = 0; // Начальное количество построек в деревне 0

    //Конструктор класса Деревня (принимает аргумент: длину массива, то есть максимальное количество построек в деревне
    public Village(int numberOfBuildings) {
        this.buildings = new Building[numberOfBuildings];//2-й этап: "досоздание" массива - выделение памяти для массива
    }

    //Метод для добавления построек в деревню (без проверки на переполнение)
    public void addBuilding(Building building, int numberOfBuildings){
        //Реализация алгоритма выхода из цикла в случае добавления количества объектов менее максимального кол-ва построек
        while (count < numberOfBuildings){//Проверка
            buildings[count] = building;
            count++;
            break;
        }
    }

    //Метод по подсчету общего количества зданий в деревне
    public void numberOfBuildings(){
        int buildingsCount = 0;
        System.out.print("Общее количество зданий в деревне (отдельный метод в Village): ");
        for(Building s : buildings){
            if (s != null){
                buildingsCount++;
            }else break;
        }
        System.out.println(buildingsCount);
    }

    //Метод подсчета количество промышленных зданий в деревне и вывод информации о них (использование оператора instanceof)
    public void showIndustrialBuildings(){
        int industrialCount = 0;
        System.out.println("Список промышленных зданий в деревне (через instanceof): ");
        for(int i = 0; i < buildings.length; i++){
            if (buildings[i] instanceof IndustrialBuilding ){
                industrialCount = industrialCount + 1;
                System.out.println(buildings[i].info());
            }
        }
        System.out.println("Kоличество промышленных зданий в деревне: "+ industrialCount);
    }

    //Метод подсчета количество промышленных зданий в деревне и вывод информации о них (способ 2)
    public void showIndustrialBuildings2(){
        int industrialCount = 0;
        System.out.println("Список промышленных зданий в деревне (с помощью дополнительного переопределенного метода s.isIndustrial()): ");
        for(Building s : buildings){
            if (s.isIndustrial() & s != null){
                industrialCount = industrialCount + 1;
                System.out.println(s.info());
            }else break;
        }
        System.out.println("Kоличество промышленных зданий в деревне: "+ industrialCount);
    }

    //Геттер для доступа к private полям
    public Building[] getBuildings() {
        return buildings;
    }
}
    /*Для случая, когда массив "динамический" - реализовано в ДЗ№9
        //Объявляем массив построек
        private Building[] buildings;

        //Конструктор, параметром которого является массив построек
        public Village(Building[] buildings) { //
            this.buildings = buildings;
        }
    */
