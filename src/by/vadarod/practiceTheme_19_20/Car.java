package by.vadarod.practiceTheme_19_20;

public class Car {
    private int id;
    private String marka;
    private int probeg;
    private String year;
    private int speed;
    private int price;

    public Car(int id, String marka, int probeg, String year, int speed, int price) {
        this.id = id;
        this.marka = marka;
        this.probeg = probeg;
        this.year = year;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", probeg=" + probeg +
                ", year='" + year + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getProbeg() {
        return probeg;
    }

    public void setProbeg(int probeg) {
        this.probeg = probeg;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
/*
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