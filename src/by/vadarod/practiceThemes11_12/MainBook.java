package by.vadarod.practice_task6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainBook {
    public static void main(String[] args) {

        //task3();
        task8();
    }

    public static void task3() {

        //Создание пустого списка книг
        List<Book> books = new ArrayList<>();
        //List<String> books = List.of("Book1", "Book2", "Book3");

        //Создание книг
        Book book1 = new Book("Book1", "Author1");
        Book book2 = new Book("Book2", "Author2");
        Book book3 = new Book("Book3", "Author3");

        //Добавление книг в список
        books.add(book1);
        books.add(book2);
        books.add(book3);

        //Вывод списка из книг
        for (Book b : books) {
            System.out.println("Books: " + b);
        }

        //Удаление книги
        books.remove(book2);
        //Если метод equals не переопределен или переопределен не правильно (just return false;), книга не удаляется
        System.out.println();

        //Вывод списка из книг после удаления
        for (Book b : books) {
            System.out.println("Books after delete: " + b);
        }
    }

    public static void task8() {

        Book book1 = new Book("Book1", "Author1");
        Book book2 = new Book("Book2", "Author1");
        Book book3 = new Book("Book3", "Author3");
        //Book book4 = new Book("Book4", "Author4");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        //books.add(book4);

        for (Book b : books) {
            System.out.println("Books: " + b);
        }
        //Если в двух из трех объектах author будут одинаковые, но title разный, их author_хешкод будет одинаковым. И если умышленно в equals везде возвращать true, то будут выводиться только 2 объекта. Это происходит потому, что идет сравнение и в hashCode по author_хешкод и в equals (hashCode(): return author.hashCode() - без title.hashCode(). А так как мы equals принудительно установили в true, то проверка будет только по hashCode.
        // Аналогично для случая с одинаковыми значениями title и author - hashCode(): return author.hashCode()+title.hashCode();

    }

}
/*
3. Условие: Создай класс Book с полями:
•	String title
•	String author
3.1. Создайте 3 книги. И добавьте эти книги в коллекцию.
3.2. Переопределите метод equals на книгах так, чтобы он всегда возвращал false
3.3. Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.

Создайте множество Set<Book> и добавьте в него несколько книг, включая дубликаты (одинаковое название и автор). Переопределите методы equals() и hashCode() так, чтобы книги с одинаковыми значениями title и author считались одинаковыми.
Выведи содержимое множества и убедись, что дубликаты не добавляются.
 */