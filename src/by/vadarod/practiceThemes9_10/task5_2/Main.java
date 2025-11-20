package by.vadarod.practice_task5_2;

public class Main {
    public static void main(String[] args) {

        //Создаем студента и сотрудника
        Student student1 = new Student("Viktor", "Ivanov", "КСиС");
        Student student2 = new Student("Ivan", "Sidodrov", "ФРЭ");
        Employee employee1 = new Employee("Vasiliy", "Petrov" ,1500);

        //Создания столов с рассадкой: за стол 1 посадим работника, за остальными будут сидеть студенты
        Table<Integer, Person> table1 = new Table<>(111, employee1);
        Table<Integer, Person> table2 = new Table<>(142, student1);
        Table<Integer, Person> table3 = new Table<>(128, student2);

        //Вывод имен персонажей, которые сидят за столом.
        table1.personAtTAble();
        table2.personAtTAble();
        table3.personAtTAble();
    }
}
/*
5. Создать класс стол. Этот класс будет состоять из двух дженериков. Первый дженерик будет отображать инвертарный номер стола(Integer), второй дженерик будет отображать персонажа, который за ним будет сидеть
6. Реализовать метод в классе стол, который будет выводить имя персонажа, который сидит за столом.
7. В классе main Создать три стола, за которыми будут сидеть студент и сотрудник.
8. Вывести поочередно  имена персонажей, которые сидят за столом.
 */