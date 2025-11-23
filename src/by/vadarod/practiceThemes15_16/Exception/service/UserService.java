package by.vadarod.practiceThemes15_16.Exception.service;

import by.vadarod.practiceThemes15_16.Exception.entity.User;
import by.vadarod.practiceThemes15_16.Exception.exception.NotCorrectPasswordException;
import by.vadarod.practiceThemes15_16.Exception.repository.UserRepository;

public class UserService {
    public User authenticate (String login, String password) {
        UserRepository userRepository = new UserRepository();
        User user = userRepository.searchUserByLogin(login);
        if (user.getPassword().equals(password)) {
           return user;
        }
        throw new NotCorrectPasswordException("Пароль не совпадает!");
    }


}
/*
4. Создать класс сервис. Реализовать в этом классе метод аутентификации пользователя (void authenticate (String login, String password). Этот метод должен проверять наличие пользователя в репозитории по логину. Если пользователя нет, то выбрасываем собственное исключение (UserNotFoundException)
 */