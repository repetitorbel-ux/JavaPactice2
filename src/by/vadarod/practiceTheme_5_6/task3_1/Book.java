package by.vadarod.practice_task3_1;

public class Book {
    int id;
    String name;
    String author;
    String publish;
    int establ;
    int pages;
    double price;

    //Конструктор без параметров для создания "пустой" книги
    public Book(){
    }

    //Конструктор с параметрами: для создания книги сразу с заданием значений по ее полям
    public Book(int idParam, String nameParam, String authorParam, String publish, int establ, int pages, double price) {
        id = idParam;
        name = nameParam;
        author = authorParam;
        this.publish = publish;
        this.establ = establ;
        this.pages = pages;
        this.price = price;
    }

    //Метод, выводящий информацию о книге (по всем полям класса) в виде одной строки
    public String info (){
        String result = " id: " + id + " name: " + name + " author: " + author + " publish: " + publish + " establ: " + establ + " pages: " + pages + " price: " + price;
    return result;
    }

    //Метод, изменяющий цену книги (в качестве параметра принимает новую цену)
    public void chgPrice(int price) {
        this.price = price;
    }

    //Метод, фильтрующий массив книг по году издания:
    //принимает массив книг и возвращает другой массив книг, у которых год издания ниже переданного года в качестве аргумента
    public Book[] chgBook(Book[] books, int establParam) {

        int count = 0; //Инициализация счетчика
        //Считаем, сколько книг подходят под условие
        for (Book s : books) { //Цикл, проходящий по всем книгам в полученном массиве books
            if (s.establ < establParam) { //Проверка по году
                count++;
            }
        }
        int j = 0; //Инициализация второго счетчика для индекса в новом массиве
        Book booksResult[] = new Book[count]; //Создание нового массива booksResult размером count
        for (int i = 0; i < books.length; i++) { //Второй цикл, который снова проходит по исходному массиву books

            if (books[i].establ < establParam) { //Проверка по году
                booksResult[j] = books[i]; //если книга подходит, она добавляется в новый массив booksResult на позицию j
                j++;
            }
        }
        return booksResult; //Возврат нового отфильтрованного массива
    }

}
/*
1	Создать класс Book c полями id (тип int), name (тип String), author (тип String), издательство ( тип String ), Год издания(тип Int), Количество страниц (тип int), цена (double). Инициализацию книги в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.
2	Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
3	Создать метод, который будет изменять цену книги (сам метод в качестве параметра будет принимать новую цену)
4	В классе main создать массив из пяти книг
5	Создать метод в классе Book, который будет принимать массив книг и возвращать из массив книг, у которых год издания ниже переданной года в методе.
 */