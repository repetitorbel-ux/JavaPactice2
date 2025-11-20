package by.vadarod.practice_task4;

public class MainPractice4 {
    public static void main(String[] args) {
        int n = 5; //Максимальное число построек

        //Создаем деревню, в которой будут добавляться и храниться объекты различного типа. Сразу задаем размер деревни с запасом
        Village myVillage = new Village(n);//При этом будет вызван конструктор в Village

        //Создаем постойки (выделяем память и присваимваем ссылки на объекты
        Fabric fabric1 = new Fabric("Лида, ул. Заречная, 21", "Кирпич", 1984, "Легкая промышленность",100, "Детские игрушки");
        Fabric fabric2 = new Fabric("Лида, ул. Летная, 2", "Панели", 2020, "Легкая промышленность",50, "Корпускная мебель");
        AdministrativeBuilding governance = new AdministrativeBuilding("Лида, ул. Замковая, 1", "Кирпич", 2000, "Общественное здание",5, "Исполком", 250);
        ApartmentBuilding apartment1 = new ApartmentBuilding("Лида, ул. Мира, 2", "Панели", 2023, "Жилье",9, 144);
        ApartmentBuilding apartment2 = new ApartmentBuilding("Лида, ул. Мира, 4", "Кирпич", 2021, "Жилье",6, 120);

        //Добавляем постройки в деревню
        myVillage.addBuilding(fabric1, n);
        myVillage.addBuilding(fabric2, n);
        myVillage.addBuilding(governance, n);
        myVillage.addBuilding(apartment1, n);
        myVillage.addBuilding(apartment2, n);


        //Вывод информации о каждой постройке и об общем количестве зданий в деревне
        Building[] existBuildins = myVillage.getBuildings();//Создание массива, в который складываем постройки из деревни
        int countBuildings = 0;
        System.out.println("В деревне существуют следующие постройки:");
        //Вывод построек в строку с проверкой на наличие null
        for(Building s : existBuildins){
            if (s != null){
                countBuildings = countBuildings + 1;
                System.out.println(s.info());
            }else break;
        }
        System.out.println("Общее количество зданий в деревне (подсчет в main): " + countBuildings);
        System.out.println();

        //Вызов метода, показывающего общее количество зданий в деревне
        myVillage.numberOfBuildings();
        System.out.println();

        //Вызов метода, показывающего количество промышленных зданий в деревне и вывод информации о них
        myVillage.showIndustrialBuildings();
        System.out.println();

        //Вызов метода#2, показывающего количество промышленных зданий в деревне и вывод информации о них
        myVillage.showIndustrialBuildings2();
    }

}
/*
2.1  Создать спортсооружение, исполком, 2 жилых дома, 2 фабрики. Значения придумать самим.
Добавить эти объекты в деревню: (реализовать метод по добавлению постройки в деревню) (должны придумать, как это сделать)
 */