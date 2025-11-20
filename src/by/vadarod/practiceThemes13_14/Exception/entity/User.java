package by.vadarod.practice_task7_Exception.entity;

public class User {
    private String login; //логин,
    private String password;// пароль,
    private String name;// имя,
    private String surname;// фамилия.

    public User(String login, String password, String name, String surname) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }
/*
1. Создать класс пользователь. Поля логин, пароль, имя, фамилия.
 */
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public User() {
    }
}
