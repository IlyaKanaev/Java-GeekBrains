package ru.maliutin.daoauthenticate.repositore;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maliutin.daoauthenticate.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByLogin(String login);
}
