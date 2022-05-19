package main.service;

import main.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    User findById(int id);

    void update(User user);

    void remove(int id);

    List<User> findAllUsers();
}
