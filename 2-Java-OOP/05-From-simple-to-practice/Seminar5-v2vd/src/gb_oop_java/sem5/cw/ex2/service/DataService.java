package gb_oop_java.sem5.cw.ex2.service;

import gb_oop_java.sem5.cw.ex2.model.User;

import java.util.List;

public interface DataService {
    User create(User user);
    List<User> read();
}
