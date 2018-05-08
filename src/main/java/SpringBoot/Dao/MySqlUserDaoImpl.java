package SpringBoot.Dao;

import SpringBoot.Entity.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@Qualifier("mySql")
public class MySqlUserDaoImpl implements UserDao{

    @Override
    public Collection<User> getAllUser() {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public void removeUserById(int id) {

    }

    @Override
    public void updateUser(User user) {

    }
}
