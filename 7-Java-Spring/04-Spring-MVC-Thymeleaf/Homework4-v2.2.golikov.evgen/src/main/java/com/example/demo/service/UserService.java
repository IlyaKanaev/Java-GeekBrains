package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Сервисный класс для работы с пользователями.
 */
@Service
@AllArgsConstructor
public class UserService {
    /**
     * Объект репозитория для работы с БД.
     */
    private final UserRepository userRepository;

    public User getUserById(Integer id){
        return userRepository.findUserById(id);
    }
    /**
     * Получение списка всех пользователей.
     * @return список пользователей.
     */
    public List<User> findAll(){
        return userRepository.findAll();
    }

    /**
     * Создание нового пользователя.
     * @param user объект пользователя.
     * @return объект пользователя с присвоенным id.
     */
    public User saveUser(User user){
        return userRepository.save(user);
    }

    /**
     * Удаление пользователя.
     * @param id уникальный идентификатор пользователя.
     */
    public void deleteById(int id){
        userRepository.deleteById(id);
    }

    /**
     * Изменение данных пользователя.
     * @param user объект пользователя с новыми данными.
     */
    public void updateUser(User user){
        userRepository.update(user);
    }
}
