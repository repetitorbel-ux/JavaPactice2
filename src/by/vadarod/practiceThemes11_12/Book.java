package by.vadarod.practice_task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //Переопределение equals, чтобы всегда работал не правильно
//    @Override
//    public boolean equals(Object o) {
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        if(title.equals(book.getTitle())){ //Сравнение Book's title с приходящим в параметрах аргументом
            return true;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return author.hashCode()+title.hashCode();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
/*
3. Условие: Создай класс Book с полями:
•	String title
•	String author
3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();
3.2 Переоперделите метод equals на книгах так,чтобы он всегда возвращал false
3.3. Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.
 */