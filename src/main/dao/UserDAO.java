package main.dao;

import main.model.User;

import java.util.List;

public interface UserDAO {
    void save(User user);

    User findById(int id);

    void update(User user);

    void remove(int id);

    List<User> findAllUsers();
}
