package main.dao;

import main.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public User findById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public void remove(int id) {
        entityManager.remove(findById(id));
    }

    @Override
    public List<User> findAllUsers() {
        return entityManager
                .createQuery("select u from " + User.class.getSimpleName() + " u", User.class).getResultList();
    }
}
