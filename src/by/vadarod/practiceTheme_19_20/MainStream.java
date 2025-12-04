package by.vadarod.practiceTheme_19_20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MainStream {
    public static void main(String[] args) throws CarNotFoundException {

        Car car1 = new Car(1, "BMW", 100000, "2015", 300, 30000);
        Car car2 = new Car(2, "AUDI", 130000, "2020", 200, 33000);
        Car car3 = new Car(2, "AUDI", 130000, "2020", 200, 33000);

        List<Car> cars = List.of(car1, car2);

        //1.6 Найти машины, у которых пробег от 50000 до 100000.
        List<Car> list = cars.stream().filter(car -> {
                    if (car.getProbeg() <= 100000 && car.getProbeg() > 50000) {
                        return true;
                    } else return false;
                }
        ).toList();

        System.out.println(list);

        List<Car> listSimply = cars.stream().filter(car -> car.getProbeg() <= 100000 && car.getProbeg() > 50000
        ).toList();

        //1.2 Найти самую быструю машину
        Optional<Car> resultSpeed = cars.stream().max(Comparator.comparing(Car::getSpeed));

        if (resultSpeed.isPresent()){
            System.out.println(resultSpeed.get());
        }

        //1.12 Получить не повторяющиеся значения марок авто (distinct).
        List<String> carModel = cars.stream().map(car ->{
            return car.getMarka();
        }).distinct().toList();

//        System.out.println(carModel.stream().distinct().toList());
        //1.13 Найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега, в заданном диапазон год выпуска. Если таких нет, выбросить своё исключение.
        Car carOne = cars.stream().filter(car -> {
            if(car.getMarka().equals("AUDI") && car.getSpeed()>100){
                return true;
            }else return false;
        }).findFirst().orElseThrow(() -> new CarNotFoundException("Нет такой машины"));
        System.out.println(carOne);

    }
}
/*
Задание №2
1. Создать класс авто. Поля: id, марка, пробег, год выпуска, максимальная скорость, цена.
1.1 Создать коллекцию из авто.
1.2 Найти самую быструю машину.
1.3 Найти самую медленную машину.
1.4 Найти самую старую
1.5 Найти самую новую
1.6 Найти машины, у которых пробег от 50000 до 100000.
1.7 Найти самую дорогую машину.
1.8 Найти самую дешёвую машину.
1.9 Отсортировать машины по пробегу (по возрастанию и по убыванию
1.10 Отсортировать машины по стоимости (по возрастанию и по убыванию)
1.11 Найти машины в диапазоне пробега от 20000 до 100000 и в диапазоне цен от 10000 до 20000.
1.12 Получить не повторяющиеся значения марок авто (distinct).
1.13 Найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега, в заданном диапазон год выпуска. Если таких нет, выбросить своё исключение.
 */