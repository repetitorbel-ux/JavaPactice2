package by.vadarod.practice_task7_Exception;

import by.vadarod.practice_task7_Exception.entity.User;
import by.vadarod.practice_task7_Exception.exception.NotCorrectPasswordException;
import by.vadarod.practice_task7_Exception.exception.UserNotFoundException;
import by.vadarod.practice_task7_Exception.service.UserService;

//import static by.vadarod.practice_task7_Exception.Service.authenticating;

public class Main {
    public static void main(String[] args) {
        authenticating();
    }
/*
Вам не нужно ничего передавать внутрь authenticate, чтобы получить логин. Вам нужно сначала получить из него результат (объект пользователя),
   а уже потом у этого результата спросить его логин.

  Разделите мысленно:
   1. Получить объект пользователя.
   2. У полученного объекта взять логин.
 */
    public static void authenticating() {
        try {
            UserService userService = new UserService();
            //userService.authenticate("Masha", "qwerty");
            User userGet = userService.authenticate("Masha", "qwerty");
            System.out.println("Здравствуйте, " + userGet.getName() + ". Добро пожаловать!");
        }
        catch (NotCorrectPasswordException notCorrectPasswordException) {
            System.out.println(notCorrectPasswordException.getMessage() + " Вы не прошли аутентификацию");
        }
        catch (UserNotFoundException userNotFoundException) {
            System.out.println(userNotFoundException.getMessage());
        }
    }

}
/*
6. В классе main при вызове метода аутентификации перехватите исключение UserNotFoundException и выведите в консоль (нет пользователя)
7. Также перехватите оставшиеся исключения и в блоке catch выведите в консоль сообщение (Вы не прошли аутентификацию)
 */