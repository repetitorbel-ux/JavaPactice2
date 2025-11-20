package by.vadarod.practice_task5_2;
//Зачем делать T1 extends Integer, T2 extends Character????
public class Table<T1 extends Integer, T2 extends Person> {

    private T1 inventoryNumber;
    private T2 characterAtTAble;

    //Конструкторы
    public Table(){
    }

    public Table(T1 inventoryNumber, T2 characterAtTAble) {
        this.inventoryNumber = inventoryNumber;
        this.characterAtTAble = characterAtTAble;
    }

    //Метод, выводящий имя персонажа, который сидит за столом
    public void personAtTAble(){
        System.out.println("За столом c инвентраным номером " + inventoryNumber+ " сидит " + characterAtTAble.getName() + " " + characterAtTAble.getSurname());
    }

//    public void printCharater(){
//        System.out.println(characterAtTAble.getName());
//    }

    public T2 getCharacterAtTAble(){
        return characterAtTAble;
    }

    public T1 getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(T1 inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public void setCharacterAtTAble(T2 characterAtTAble) {
        this.characterAtTAble = characterAtTAble;
    }


}
/*
5. Создать класс стол. Этот класс будет состоять из двух дженериков. Первый дженерик будет отображать инвертарный номер стола(Integer), второй дженерик будет отображать персонажа, который за ним будет сидеть
6. Реализовать метод в классе стол, который будет выводить имя персонажа, который сидит за столом.
7. В классе main Создать три стола, за которыми будут сидеть студент и сотрудник.
8. Вывести поочередно  имена персонажей, которые сидят за столом.
 */