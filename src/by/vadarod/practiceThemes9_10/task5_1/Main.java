package by.vadarod.practice_task5_1;

public class Main {
    public static void main(String[] args) {

        //Создаем кофемашины
        CofeeMachine cofeeMachine1 = new CofeeMachine("Delongi", " Вариант кофе", 1500, false);
        CofeeMachine cofeeMachine2 = new CofeeMachine("Roma", " Вариант кофе+какао", 1800, false);

        //Создаем холодильники
        Refregirator refregirator1 = new Refregirator("Холодильник", " Бош", 1100, false);
        Refregirator refregirator2 = new Refregirator("Холодильник2", " Индезит", 1300, false);

        //Создаем стиральные машины
        WashingMachine washingMachine1 = new WashingMachine("Стиральная машина1", " Бош", 1250, false);
        WashingMachine washingMachine2 = new WashingMachine("Стиральная машина2", " LG", 1350, false);

        //Создаем пылесосы
        Vacuum vacuum1 = new Vacuum("Пылесос1", " Бош", 1250, false);
        Vacuum vacuum2 = new Vacuum("Пылесос2", " LG", 1400, false);

        //Создаем выставку со всей техникой и выводим в консоль
        Device[] exhibition = {cofeeMachine1, cofeeMachine2, refregirator1, refregirator2, washingMachine1, washingMachine2};
        for(Device e : exhibition) {
            e.work();
        }

        //Создаем выставку кухонной техники
        KitchenDevice[] kitchenExhibition = {refregirator1, refregirator2, washingMachine1, washingMachine2};
        for(KitchenDevice k : kitchenExhibition) {
            k.broken();
        }

        //Создаем выставку кофемашин
        CofeeMachine[] coffeExhibition = {cofeeMachine1, cofeeMachine2};
        for(CofeeMachine c : coffeExhibition) {
            c.makeCapuchino();
        }

        //Вызов метода start
        cofeeMachine1.start();
    }
}
/*
7. В классе main cоздайте по паре объектов на основании вышесозданных классов. Создайте в классе main создайте выставку из электроприбров и продемонстрируйте способности каждого электроприбора
9.  В классе main сделать выставку только из Кухонной техники. Продемонстрировать спосбоности всех электроприборов в этой выставке.
10. В классе main сделать выставку кофемашин. Продемонстрировать способности всех кофе машин.
11. На любой кофемашине вызовете метод start(). После этого переопределите метод start так, чтобы этот метод включал прибор (менял значение Boolean isOn на true.) Выведите результат в консоль
 */