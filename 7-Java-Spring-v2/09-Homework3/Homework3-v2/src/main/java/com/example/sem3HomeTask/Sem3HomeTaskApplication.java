package com.example.sem3HomeTask;
/*
Создать сервис "RegistrationService", который принимает на вход
данные о пользователе (имя, возраст, email),
создает пользователя с помощью UserService,
затем использует DataProcessingService
для добавления пользователя в список
и выполнения операций над этим списком.
После выполнения каждой операции, использовать NotificationService
для вывода информации о выполненной операции
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sem3HomeTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sem3HomeTaskApplication.class, args);
    }

}
