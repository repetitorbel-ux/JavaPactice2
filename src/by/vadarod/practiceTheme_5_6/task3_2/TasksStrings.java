package by.vadarod.practice_task3_2;

public class TasksStrings {
    public static void main(String[] args) {
        String str = "I like Java";
        int length = str.length();
        char resultChar = str.charAt(length - 1);
        System.out.println("Последний символ строки: " + resultChar);

        boolean isTrue = str.endsWith("java!");
        System.out.println("Заканчивается ли ваша строка подстрокой java!: " + isTrue);

        String resultStr = str.substring(7, 11); //Вырезание подстроки Java в заранее известной строке
        System.out.println("Вырезанная подстрока: " + resultStr);

        //Вырезание подстроки Java из любой строки
        int indexStart = str.indexOf("Java"); //Получение индекса, с которого начинается заданная подстрока
        String strJava = "Java";
        String resultStrFinal = str.substring(indexStart, indexStart + strJava.length());
        System.out.println(resultStrFinal);
    }
}
/*
2. Распечатать последний символ строки. Используем метод String.charAt().
3. Проверить, заканчивается ли ваша строка подстрокой “java!”. Используем метод String.endsWith().
10. Вырезать строку Java c помощью метода String.substring().
 */