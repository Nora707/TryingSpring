package SpringBoot.Dao;

import SpringBoot.Entity.User;

import java.util.Collection;

public interface UserDao {
    Collection<User> getAllUser();

    User getUserById(int id);

    void removeUserById(int id);

    void updateUser(User user);
}
