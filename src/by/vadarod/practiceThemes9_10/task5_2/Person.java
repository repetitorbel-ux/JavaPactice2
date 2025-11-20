package by.vadarod.practice_task5_2;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}

/*
1. Создать класс Персонаж. Поля Имя, фамилия.
2. Создать класс Студент. Поля факультет
3. Создать класс Сотрудник. Поля, зарплата
4.
5. Создать класс стол. Этот класс будет состоять из двух дженериков. Первый дженерик будет отображать инвертарный номер стола(Integer), второй дженерик будет отображать персонажа, который за ним будет сидеть
6. Реализовать метод в классе стол, который будет выводить имя персонажа, который сидит за столом.
7. В классе main Создать три стола, за которыми будут сидеть студент и сотрудник.
8. Вывести поочередно  имена персонажей, которые сидят за столом.
 */
